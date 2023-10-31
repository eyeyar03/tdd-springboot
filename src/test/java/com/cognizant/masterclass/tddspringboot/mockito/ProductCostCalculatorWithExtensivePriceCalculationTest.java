package com.cognizant.masterclass.tddspringboot.mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import com.cognizant.masterclass.tddspringboot.productcostcalculator.Order;
import com.cognizant.masterclass.tddspringboot.productcostcalculator.ProductCostCalculator;
import org.junit.jupiter.api.Test;

class ProductCostCalculatorWithExtensivePriceCalculationTest {

  @Test
  void thisTestExecutesIn10Seconds() {
    ProductCostCalculator productCostCalculator =
        new ProductCostCalculator(new PriceServiceWithExtensiveComputations());

    Order order = Order.of("Apple", 3);

    double actualTotalPrice = productCostCalculator.compute(order);

    assertThat(actualTotalPrice, equalTo(6.0));
  }

  @Test
  void thisTestWillExecutesFasterUsingMockedPriceService() {
    ProductCostCalculator productCostCalculator =
        new ProductCostCalculator(new MockedPriceService(2.0));

    Order order = Order.of("Apple", 3);

    double actualTotalPrice = productCostCalculator.compute(order);

    assertThat(actualTotalPrice, equalTo(6.0));
  }
}
