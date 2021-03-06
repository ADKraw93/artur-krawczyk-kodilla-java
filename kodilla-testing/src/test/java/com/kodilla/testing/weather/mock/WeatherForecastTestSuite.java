package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    @BeforeEach //Nie wiem jak to zrobić przy użyciu BeforeAll
    public  void beforeEachTest() {
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }

    @Test
    void testCalculateForecastWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testCalculateMeanWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        Double result = weatherForecast.calculateMean();
        Double expectedResult = (25.5+26.2+24.8+25.2+26.1)/5; //

        //Then
        Assertions.assertEquals(expectedResult, result, 0.001);
    }

    @Test
    void testCalculateMedianOddLengthWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        Double result = weatherForecast.calculateMedian();
        Double expectedResult = 25.5;

        //Then
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void testCalculateMedianEvenLengthWithMock() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Krakow", 3.5);
        temperaturesMap.put("Rzeszow", 1.0);
        temperaturesMap.put("Wroclaw", 2.5);
        temperaturesMap.put("Warszawa", 5.4);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        Double result = weatherForecast.calculateMedian();
        Double expectedResult = 3.0;

        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}