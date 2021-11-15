package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightScanner {

    public void findFilght(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> flightsMap = new HashMap <String, Boolean>();
        flightsMap.put("Los Angeles", true);
        flightsMap.put("Berlin", false);
        flightsMap.put("Moscow", true);
        flightsMap.put("Teheran", false);

        if(flightsMap.containsKey(flight.getArrivalAirport())){
            if(flightsMap.get(flight.getArrivalAirport())==true){
                System.out.println("Such a flight is possible.");
            } else {
                System.out.println("Such a flight is impossible.");
            }
        } else {
            throw new RouteNotFoundException("There is no such an airport");
        }

    }
}
