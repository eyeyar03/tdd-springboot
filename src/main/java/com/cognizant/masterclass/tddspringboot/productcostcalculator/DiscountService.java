package com.cognizant.masterclass.tddspringboot.productcostcalculator;

public interface DiscountService {

    double getDiscount(String discountCode, String product);
}
