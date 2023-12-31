package com.cognizant.masterclass.tddspringboot.productcostcalculator;

import java.util.Optional;

public class SimpleDiscountService implements DiscountService {

  @Override
  public double getDiscount(String discountCode, String product) {
    double discount = 0;

    discountCode = Optional.ofNullable(discountCode).orElse("").trim();

    if (!discountCode.isEmpty() && !discountCode.contains(product)) {
      throw new InvalidDiscountException();
    }

    if ("Apple20".equals(discountCode)) {
      discount = .20;
    } else if ("Mango15".equals(discountCode)) {
      discount = .15;
    }

    return discount;
  }
}
