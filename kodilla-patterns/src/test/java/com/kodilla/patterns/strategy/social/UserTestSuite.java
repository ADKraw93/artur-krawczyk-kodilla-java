package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies(){
        //Given
        User john = new Millenials("John Smith");
        User tom = new YGeneration("Tom Ridley");
        User cindy = new ZGeneration("Cindy Black");

        //When
        String johnPublication = john.sharePost();
        System.out.println("John: " + johnPublication);
        String tomPublication = tom.sharePost();
        System.out.println("Tom: " + tomPublication);
        String cindyPublication = cindy.sharePost();
        System.out.println("Cindy: " + cindyPublication);

        //Then
        assertEquals(johnPublication, "Shared on Facebook.");
        assertEquals(tomPublication, "Shared on Twitter.");
        assertEquals(cindyPublication, "Shared on Snapchat.");
    }

    @Test
    void testIndividualSharingStrategy(){
        //Given
        User john = new Millenials("John Smith");

        //Then
        String johnPublication = john.sharePost();
        System.out.println("John first: " + johnPublication);
        john.setSocialPublisher(new SnapchatPublisher());
        johnPublication = john.sharePost();
        System.out.println("John now: " + johnPublication);

        //When
        assertEquals(johnPublication, "Shared on Snapchat.");
    }
}
