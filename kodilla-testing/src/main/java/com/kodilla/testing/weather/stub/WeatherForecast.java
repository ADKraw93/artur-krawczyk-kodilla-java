package com.kodilla.testing.weather.stub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public Double calculateMean(){
        double result=0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            result = result + temperature.getValue();

        }
        result = result/temperatures.getTemperatures().size();
        return result;
    }

    public Double calculateMedian(){
        ArrayList<Double> sortedList = new ArrayList<>();
        double result;
        int position;

        //first we sort the temperatures
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            sortedList.add(temperature.getValue());

            /*if(sortedList.isEmpty()){
                sortedList.add(temperature.getValue()); //for empty list we just add an element
            } else { //for non-empty list we sort by comparing each element
                for(int i=0; i < sortedList.size(); i++){
                    if((sortedList.get(i) > temperature.getValue()) ){
                        sortedList.add(i, temperature.getValue());
                    } else if (i == sortedList.size()-1) {
                        sortedList.add(temperature.getValue());
                    }
                }
            }*/
        }
        Object[] sortedArray = sortedList.toArray();
        Arrays.sort(sortedArray);
        // now I take the element from sorted list
        position = (sortedArray.length-1)/2;
        if(sortedArray.length%2==1){
            result = (double) sortedArray[position];
        } else {
            result = ((double) sortedArray[position] +(double) sortedArray[position+1])/2;
        }

        return result;
    }
}