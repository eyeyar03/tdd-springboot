package com.cognizant.masterclass.tddspringboot.ProductCostCalculator;

public class ProductCostCalculator {

    public Integer compute(String product, int qty) {

        if (product.equals("apple")) {
            return  2 * qty;
        }

        if (product.equals("mango")) {
            return 4 * qty;
        }

        return qty;
    }
}
