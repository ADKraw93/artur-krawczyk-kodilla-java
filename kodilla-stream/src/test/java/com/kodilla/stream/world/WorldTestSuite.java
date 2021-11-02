package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testWorldPeopleQunatity(){
        //Given
        Country country1 = new Country(new BigDecimal("1111111111"));
        Country country2 = new Country(new BigDecimal("2222222222"));
        Country country3 = new Country(new BigDecimal("3333333333"));
        Country country4 = new Country(new BigDecimal("4444444444"));
        Continent continent1 = new Continent();
        Continent continent2 = new Continent();
        World world = new World();

        //When
        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent2.addCountry(country3);
        continent2.addCountry(country4);
        world.addContinent(continent1);
        world.addContinent(continent2);
        BigDecimal worldPopulation = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPopulation = new BigDecimal("11111111110");
        assertEquals(expectedPopulation, worldPopulation);
    }
}
