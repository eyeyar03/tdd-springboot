package com.cognizant.masterclass.tddspringboot.productcostcalculator;

public class ProductCostCalculator {
    public double compute(String product, int quantity) {
        return 2 * quantity;
    }

    public double computeMangoes(String product, int quantity) {
        return 3 * quantity;
    }


    public Boolean computeNotAvailable(String product, boolean a) {
        if (product.equals("Tomato"));
        return a;
    }
}
