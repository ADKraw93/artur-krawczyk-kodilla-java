package com.kodilla.good.patterns.flights;

import java.util.ArrayList;

public class FlightsList {
    private ArrayList<Flight> listOfFlights;

    public FlightsList(ArrayList<Flight> listOfFlights) {
        this.listOfFlights = listOfFlights;
    }

    public FlightsList() {
        this.listOfFlights = new ArrayList<Flight>();
    }

    public ArrayList<Flight> getListOfFlights() {
        return listOfFlights;
    }
}
