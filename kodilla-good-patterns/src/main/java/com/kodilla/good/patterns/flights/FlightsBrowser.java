package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightsBrowser {
    private final FlightsList flightsList;

    public FlightsBrowser(FlightsList flightsList) {
        this.flightsList = flightsList;
    }

    public List<Flight> searchFrom(String airport) {
        List<Flight> result = flightsList.getListOfFlights().
                stream().
                filter(f -> f.getDeparture().equals(airport)).
                collect(Collectors.toList());
        return result;
    }

    public List<Flight> searchTo(String airport) {
        List<Flight> result = flightsList.getListOfFlights().
                stream().
                filter(f -> f.getArrival().equals(airport)).
                collect(Collectors.toList());
        return result;
    }

    public List<List<Flight>> searchVia(String airport) {

        List<List<Flight>> result = new ArrayList<>();

        List<Flight> flightsTo      = searchTo(airport);
        List<Flight> flightsFrom    = searchFrom(airport);

        result.add(flightsTo);
        result.add(flightsFrom);

        return result;
    }
}
