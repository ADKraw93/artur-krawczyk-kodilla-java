package com.kodilla.exception.test;

public class FlightExecutor {

    public static void main(String[] args){
        Flight flight = new Flight("Warsaw", "Beijing");
        FlightScanner flightScanner = new FlightScanner();

        try{
            flightScanner.findFilght(flight);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
