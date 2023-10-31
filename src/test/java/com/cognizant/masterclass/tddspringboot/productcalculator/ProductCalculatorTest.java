package com.cognizant.masterclass.tddspringboot.productcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductCalculatorTest {

    @Test
    public void shouldReturnInvalidPriceFor2Apples() {
        ProductCalculator productCalculator = new ProductCalculator();
        Assertions.assertEquals(6, productCalculator.compute("Apple", 2));
    }
}
