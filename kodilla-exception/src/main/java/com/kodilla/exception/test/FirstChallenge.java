package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0); //jak chciałem to dać w nawiasy w try () to był problem z double
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: you can not divide by 0"); //dlaczego nie mogę po prostu użyć obietu e? Co się w nim właściwie znajduje?
        } finally {
            System.out.println("Kod doszedł do końca.");
        }

    }
}