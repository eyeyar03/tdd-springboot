package com.cognizant.masterclass.tddspringboot.mockito;

import com.cognizant.masterclass.tddspringboot.productcostcalculator.PriceService;

public class MockedPriceService implements PriceService {
  private final double mockedPrice;

  public MockedPriceService(double mockedPrice) {
    this.mockedPrice = mockedPrice;
  }

  @Override
  public double getPrice(String product) {
    return mockedPrice;
  }
}
