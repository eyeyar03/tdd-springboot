package com.cognizant.masterclass.tddspringboot;

import com.cognizant.masterclass.tddspringboot.ProductCostCalculator.PriceNotFoundException;
import com.cognizant.masterclass.tddspringboot.ProductCostCalculator.ProductCostCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestProductCostCalculator {



    @Test
    void ComputesCorrectCostForApples() throws PriceNotFoundException {
        ProductCostCalculator calc = new ProductCostCalculator();

        double total = calc.compute("apple", 10);
        Assertions.assertEquals(20, total);
    }

    @Test
    void ComputeCorrectCostForMangoes() throws PriceNotFoundException {
        ProductCostCalculator calc = new ProductCostCalculator();

        double total = calc.compute("mango", 5);
        Assertions.assertEquals(20, total);
    }
}
