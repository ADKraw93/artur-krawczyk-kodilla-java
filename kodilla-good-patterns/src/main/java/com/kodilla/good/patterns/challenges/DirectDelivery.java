package com.kodilla.good.patterns.challenges;

public class DirectDelivery implements TransportMethod {
     String transportMethod;

     public DirectDelivery() {
         this.transportMethod = "courier";
     }

    @Override
    public void process(String recipientAdress, String senderAdress) {
        System.out.println("Transport sent from: " + senderAdress + " to: " + recipientAdress + " via: " + transportMethod);
    }
}
