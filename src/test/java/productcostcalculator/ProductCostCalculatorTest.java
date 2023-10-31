package productcostcalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ProductCostCalculatorTest {

  @Test
  void shouldReturn6PesosFor3Apples() {
    PriceService priceService = new SimplePriceService();

    ProductCostCalculator productCostCalculator = new ProductCostCalculator(priceService);

    double expectedTotalPrice = productCostCalculator.compute("Apple", 3);

    assertEquals(6, expectedTotalPrice);
  }

  @Test
  void shouldReturn9PesosFor3Mangoes() {
    PriceService priceService = new SimplePriceService();

    ProductCostCalculator productCostCalculator = new ProductCostCalculator(priceService);

    double expectedTotalPrice = productCostCalculator.compute("Mango", 3);

    assertEquals(9, expectedTotalPrice);
  }

  @Test
  void shouldThrowPriceNotFoundExceptionWhenNoCorrespondingPriceFound() {
    PriceService priceService = new SimplePriceService();

    ProductCostCalculator productCostCalculator = new ProductCostCalculator(priceService);

    assertThrows(PriceNotFoundException.class, () -> productCostCalculator.compute("Tomato", 3));
  }
}
