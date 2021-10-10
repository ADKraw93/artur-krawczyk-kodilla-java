package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        // SimpleUser testing
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        System.out.println("SimpleUser testing:");

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // Calculator testing
        Calculator calculator = new Calculator();

        double resultAdding = calculator.add(1.5, 2.33);
        double resultSubtracting = calculator.subtract(1.5, 2.33);

        System.out.println("Calculator testing:");

        if(resultAdding == (1.5+2.33)){
            System.out.println("Test of \"add\" method passed.");
        } else {
            System.out.println("Error!. Test of \"add\" method failed.");
        }

        if(resultSubtracting == (1.5-2.33)){
            System.out.println("Test of \"subtract\" method passed.");
        } else {
            System.out.println("Error!. Test of \"subtract\" method failed.");
        }
    }
}