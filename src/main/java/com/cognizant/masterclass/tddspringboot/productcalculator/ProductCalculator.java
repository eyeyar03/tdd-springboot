package com.cognizant.masterclass.tddspringboot.productcalculator;

import org.springframework.util.StringUtils;

public class ProductCalculator {
    public int compute(String product, int quantity) {

        if ("Mango".equalsIgnoreCase(product)) {
            return 3* quantity;
        } else {
            return 2 * quantity;
        }
    }
}
