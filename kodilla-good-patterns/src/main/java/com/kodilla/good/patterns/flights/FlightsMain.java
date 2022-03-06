package com.kodilla.good.patterns.flights;

import java.util.List;

public class FlightsMain {
    public static void main(String[] args){

        FlightsListSample flightsListSample = new FlightsListSample();
        FlightsList flightsList = flightsListSample.createSampleFlightsList();
        FlightsBrowser flightsBrowser = new FlightsBrowser(flightsList);

        System.out.println("Searching from Warsaw");
        List<Flight> flightsFrom = flightsBrowser.searchFrom("Warsaw");
        System.out.println(flightsFrom.toString());

        System.out.println("\nSearching to Moscov");
        List<Flight> flightsTo = flightsBrowser.searchTo("Moscov");
        System.out.println(flightsTo.toString());

        System.out.println("\nSearching via Paris");
        List<List<Flight>> flightsVia = flightsBrowser.searchVia("Paris");
        System.out.println(flightsVia.toString());
    }
}
