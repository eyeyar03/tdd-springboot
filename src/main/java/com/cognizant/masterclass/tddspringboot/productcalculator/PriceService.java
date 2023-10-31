package com.cognizant.masterclass.tddspringboot.productcalculator;

public class PriceService {

    public int getPrice(String product) throws PriceNotFoundException {
        int price = 0;

        if ("Apple".equalsIgnoreCase(product)) {
            price = 2;
        }else if ("Mango".equalsIgnoreCase(product)) {
            price = 3;
        } else {
            throw new PriceNotFoundException();
        }

        return price;
    }
}
