package com.kodilla.good.patterns.challenges;

public interface TransportService {
    String recipientAdress = null;
    String senderAdress = null;
    String transportMethod = null;

    public void process(String recipientAdress, String senderAdress);
}
