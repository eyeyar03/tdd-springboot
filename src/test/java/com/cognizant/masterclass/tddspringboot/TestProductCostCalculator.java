package com.cognizant.masterclass.tddspringboot;

import com.cognizant.masterclass.tddspringboot.ProductCostCalculator.ProductCostCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestProductCostCalculator {

    @Test
    void ComputesCorrectCostForApples() {
        ProductCostCalculator calc = new ProductCostCalculator();

        int total = calc.compute("apple", 10);
        Assertions.assertEquals(6, total);
    }
}
