package com.cognizant.masterclass.tddspringboot.productcalculator;

import org.springframework.util.StringUtils;

public class ProductCalculator {
    public int compute(String product, int quantity) throws PriceNotFoundException {

        if ("Mango".equalsIgnoreCase(product)) {
            return 3* quantity;
        } else if ("Apple".equalsIgnoreCase(product)){
            return 2 * quantity;
        } else {
            throw new PriceNotFoundException();
        }
    }
}
