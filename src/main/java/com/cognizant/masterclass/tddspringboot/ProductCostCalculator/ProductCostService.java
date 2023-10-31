package com.cognizant.masterclass.tddspringboot.ProductCostCalculator;

import java.util.Arrays;
import java.util.List;

public class ProductCostService {

    private String[] products = {"apple", "mango"};

    public double getPrice(String product) throws PriceNotFoundException {

        List<String> productList = Arrays.asList(products);
        boolean found = productList.contains(product);

        if (!found) {
            throw new PriceNotFoundException();
        }

        if ("apple".equals(product)) {
            return  2;
        }

        if ("mango".equals(product)) {
            return 4;
        }


        return 1;
    }
}
