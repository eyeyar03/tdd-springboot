package com.cognizant.masterclass.tddspringboot.mockito;

import com.cognizant.masterclass.tddspringboot.productcostcalculator.DiscountService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AnotherDiscountServiceTest {

  @Test
  void shouldCallDiscountRequestLoggerService() {
    DiscountRequestLoggerService discountRequestLoggerService =
        Mockito.mock(DiscountRequestLoggerService.class);

    DiscountService discountService = new AnotherDiscountService(discountRequestLoggerService);

    discountService.getDiscount("Apple20", "Apple");

    Mockito.verify(discountRequestLoggerService).log("Apple", "Apple20");
  }
}
