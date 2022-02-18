package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FlightsBrowser {
    private final FlightsList flightsList;

    public FlightsBrowser(FlightsList flightsList) {
        this.flightsList = flightsList;
    }

    public void searchFrom(String airport) {
        String result = flightsList.getListOfFlights().
                stream().
                filter(f -> f.getDeparture().equals(airport)).
                map(f -> f.toString()).
                collect(Collectors.joining("\n"));
        System.out.println(result);
    }

    public void searchTo(String airport) {
        String result = flightsList.getListOfFlights().
                stream().
                filter(f -> f.getArrival().equals(airport)).
                map(f -> f.toString()).
                collect(Collectors.joining("\n"));
        System.out.println(result);
    }

    public void searchVia(String airport) {
        ArrayList<String> flightsFrom = (ArrayList<String>) flightsList.getListOfFlights().
                stream().
                filter(f -> f.getArrival().equals(airport)).
                map(Flight::getDeparture).
                collect(Collectors.toList());

        ArrayList<String> flightsTo = (ArrayList<String>) flightsList.getListOfFlights().
                stream().
                filter(f -> f.getDeparture().equals(airport)).
                map(Flight::getArrival).
                collect(Collectors.toList());

        for(String fromAirport: flightsFrom) {
            for(String toAirport: flightsTo) {
                if(!fromAirport.equals(toAirport)) {
                    System.out.println("Flight from: " + fromAirport + " to: " + toAirport + " via: " + airport);
                }
            }
        }

        //System.out.println(result);
    }
}
