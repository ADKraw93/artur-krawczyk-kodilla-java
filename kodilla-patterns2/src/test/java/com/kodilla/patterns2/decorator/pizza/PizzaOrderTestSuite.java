package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.BasicTaxiOrder;
import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void BasicPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(10), calculatedCost);
    }

    @Test
    public void BasicPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Size 30cm, thin crust + tomato bottom + cheese", description);
    }

    @Test
    public void ChangeSize() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BiggerSizeDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        String description = theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(20), calculatedCost);
        assertEquals("Size 40cm, thin crust + tomato bottom + cheese", description);
    }

    @Test
    public void ChangeBottom() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new GarlicBottomDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        String description = theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(12), calculatedCost);
        assertEquals("Size 30cm, thin crust + garlic bottom + cheese", description);
    }

    @Test
    public void AddIngredients() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new AdditionalHamDecorator(theOrder);
        theOrder = new AdditionalMushroomsDecorator(theOrder);
        theOrder = new AdditionalPineappleDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        String description = theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(24), calculatedCost);
        assertEquals("Size 30cm, thin crust + tomato bottom + cheese + ham + mushrooms + pineapple", description);
    }

    @Test
    public void CheckComplexChanges() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new AdditionalHamDecorator(theOrder);
        theOrder = new AdditionalMushroomsDecorator(theOrder);
        theOrder = new AdditionalPineappleDecorator(theOrder);
        theOrder = new GarlicBottomDecorator(theOrder);
        theOrder = new BiggerSizeDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        String description = theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(36), calculatedCost);
        assertEquals("Size 40cm, thin crust + garlic bottom + cheese + ham + mushrooms + pineapple", description);
    }
}
