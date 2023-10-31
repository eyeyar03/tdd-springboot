package com.cognizant.masterclass.tddspringboot.productcostcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductCostCalculatorTest {
    @Test
    void shouldReturn6pesosFor3Apples(){
        ProductCostCalculator productCostCalculator = new ProductCostCalculator();

        double expectedTotalPrice = productCostCalculator.compute("Apple", 3);

        assertEquals(6, expectedTotalPrice);
    }

    @Test
    void shouldReturnPriceFor3Mangoes(){
        ProductCostCalculator productCostCalculator = new ProductCostCalculator();

        double expectedTotalPrice = productCostCalculator.computeMangoes("Mangoes", 3);

        assertEquals(6, expectedTotalPrice);
    }

    @Test
    void shouldReturnPriceFor3MangoesPassed(){
        ProductCostCalculator productCostCalculator = new ProductCostCalculator();

        double expectedTotalPrice = productCostCalculator.computeMangoes("Mangoes", 3);

        assertEquals(9, expectedTotalPrice);
    }

}
