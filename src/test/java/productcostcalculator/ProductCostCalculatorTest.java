package productcostcalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ProductCostCalculatorTest {

  @Test
  void shouldReturn6PesosFor3Apples() {
    ProductCostCalculator productCostCalculator = new ProductCostCalculator();

    double expectedTotalPrice = productCostCalculator.compute("Apple", 3);

    assertEquals(6, expectedTotalPrice);
  }

  @Test
  void shouldReturn9PesosFor3Mangoes() {
    ProductCostCalculator productCostCalculator = new ProductCostCalculator();

    double expectedTotalPrice = productCostCalculator.compute("Mango", 3);

    assertEquals(9, expectedTotalPrice);
  }

  @Test
  void shouldThrowPriceNotFoundExceptionWhenNoCorrespondingPriceFound() {
    ProductCostCalculator productCostCalculator = new ProductCostCalculator();

    assertThrows(PriceNotFoundException.class, () -> productCostCalculator.compute("Tomato", 3));
  }
}
