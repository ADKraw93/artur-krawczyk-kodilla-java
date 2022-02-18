package com.kodilla.good.patterns.flights;

public class FlightsListSample {
    private Flight flight1 = new Flight("Warsaw", "Paris");
    private Flight flight2 = new Flight("Paris", "Berlin");
    private Flight flight3 = new Flight("Berlin", "Warsaw");
    private Flight flight4 = new Flight("Warsaw", "Berlin");
    private Flight flight5 = new Flight("Berlin", "Paris");
    private Flight flight6 = new Flight("Warsaw", "Moscov");
    private Flight flight7 = new Flight("Moscov", "Paris");
    private Flight flight8 = new Flight("Moscov", "Berlin");
    private Flight flight9 = new Flight("Berlin", "Moscov");
    private Flight flight10 = new Flight("Paris", "Moscov");

    private FlightsList flightsList = new FlightsList();

    public FlightsList createSampleFlightsList() {
        flightsList.getListOfFlights().add(flight1);
        flightsList.getListOfFlights().add(flight2);
        flightsList.getListOfFlights().add(flight3);
        flightsList.getListOfFlights().add(flight4);
        flightsList.getListOfFlights().add(flight5);
        flightsList.getListOfFlights().add(flight6);
        flightsList.getListOfFlights().add(flight7);
        flightsList.getListOfFlights().add(flight8);
        flightsList.getListOfFlights().add(flight9);
        flightsList.getListOfFlights().add(flight10);

        return flightsList;
    }
}
