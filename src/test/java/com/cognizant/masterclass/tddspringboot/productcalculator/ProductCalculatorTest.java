package com.cognizant.masterclass.tddspringboot.productcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductCalculatorTest {

    @Test
    public void shouldComputePriceFor2Apples() {
        ProductCalculator productCalculator = new ProductCalculator();
        Assertions.assertEquals(4, productCalculator.compute("Apple", 2));
    }

    @Test
    public void shouldComputePriceFor3Mangos() {
        ProductCalculator productCalculator = new ProductCalculator();
        Assertions.assertEquals(9, productCalculator.compute("Mango", 3));
    }

    @Test
    public void shouldThrowErrorWhenProductIsInvalid() {
        ProductCalculator productCalculator = new ProductCalculator();
        Assertions.assertThrows(PriceNotFoundException.class, () -> productCalculator.compute("invalid", 3));
    }


}
