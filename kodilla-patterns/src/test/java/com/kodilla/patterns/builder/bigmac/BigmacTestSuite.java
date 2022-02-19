package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void TestBurgerConstruction() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("classic")
                .ingredient("onion")
                .burgers(2)
                .ingredient("cheese")
                .sauce("ketchup")
                .ingredient("bacon")
                .ingredient("salad")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals(4, howManyIngredients);
    }
}
