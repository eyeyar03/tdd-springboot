package com.cognizant.masterclass.tddspringboot.ProductCostCalculator;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductCostCalculator {

    @Autowired
    private  ProductCostService productCostService;

    public Double compute(String product, double qty) throws PriceNotFoundException {

        return qty * productCostService.getPrice(product);

    }
}
