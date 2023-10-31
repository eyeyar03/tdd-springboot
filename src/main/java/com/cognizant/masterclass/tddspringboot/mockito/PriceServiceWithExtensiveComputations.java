package com.cognizant.masterclass.tddspringboot.mockito;

import com.cognizant.masterclass.tddspringboot.productcostcalculator.PriceService;
import com.cognizant.masterclass.tddspringboot.productcostcalculator.SimplePriceService;

public class PriceServiceWithExtensiveComputations implements PriceService {

    private final PriceService priceService = new SimplePriceService();

    @Override
    public double getPrice(String product) {
        try {
            Thread.sleep(10000); // sleep for 10 seconds to simulate extensive computations
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return priceService.getPrice(product);
    }
}
