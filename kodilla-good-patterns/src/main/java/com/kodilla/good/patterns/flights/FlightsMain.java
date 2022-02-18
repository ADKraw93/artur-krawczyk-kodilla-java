package com.kodilla.good.patterns.flights;

public class FlightsMain {
    public static void main(String[] args){

        FlightsListSample flightsListSample = new FlightsListSample();
        FlightsList flightsList = flightsListSample.createSampleFlightsList();
        FlightsBrowser flightsBrowser = new FlightsBrowser(flightsList);

        System.out.println("Searching from Warsaw");
        flightsBrowser.searchFrom("Warsaw");

        System.out.println("\nSearching to Moscov");
        flightsBrowser.searchTo("Moscov");

        System.out.println("\nSearching via Paris");
        flightsBrowser.searchVia("Paris");
    }
}
