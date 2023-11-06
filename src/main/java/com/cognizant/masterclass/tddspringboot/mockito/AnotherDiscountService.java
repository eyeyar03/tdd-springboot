package com.cognizant.masterclass.tddspringboot.mockito;

import com.cognizant.masterclass.tddspringboot.productcostcalculator.DiscountService;
import com.cognizant.masterclass.tddspringboot.productcostcalculator.SimpleDiscountService;

public class AnotherDiscountService implements DiscountService {

  private DiscountService discountService = new SimpleDiscountService();

  private final DiscountRequestLoggerService discountRequestLoggerService;

  public AnotherDiscountService(DiscountRequestLoggerService discountRequestLoggerService) {
    this.discountRequestLoggerService = discountRequestLoggerService;
  }

  @Override
  public double getDiscount(String discountCode, String product) {
    discountRequestLoggerService.log(product, discountCode);

    return discountService.getDiscount(discountCode, product);
  }
}
