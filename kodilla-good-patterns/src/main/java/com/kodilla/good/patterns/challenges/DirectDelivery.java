package com.kodilla.good.patterns.challenges;

public class DirectDelivery implements TransportService{
     String recipientAdress;
     String senderAdress;
     String transportMethod;

     public DirectDelivery() {
         this.recipientAdress = null;
         this.senderAdress = null;
         this.transportMethod = "courier";
     }

    @Override
    public void process(String recipientAdress, String senderAdress) {
         this.recipientAdress = recipientAdress;
         this.senderAdress = senderAdress;
        System.out.println("Transport sent from: " + senderAdress + " to: " + recipientAdress + " via: " + transportMethod);
    }
}
