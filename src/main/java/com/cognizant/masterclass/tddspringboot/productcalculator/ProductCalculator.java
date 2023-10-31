package com.cognizant.masterclass.tddspringboot.productcalculator;

import org.springframework.util.StringUtils;

public class ProductCalculator {
    public int compute(String product, int quantity) throws PriceNotFoundException {
        PriceService priceService = new PriceService();
        return quantity * priceService.getPrice(product);
    }
}
