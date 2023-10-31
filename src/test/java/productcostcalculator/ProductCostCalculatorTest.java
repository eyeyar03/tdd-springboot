package productcostcalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductCostCalculatorTest {

  private ProductCostCalculator productCostCalculator;

  @BeforeEach
  void setup() {
    PriceService priceService = new SimplePriceService();

    productCostCalculator = new ProductCostCalculator(priceService);
  }

  @Test
  void shouldReturn6PesosFor3Apples() {
    double expectedTotalPrice = productCostCalculator.compute("Apple", 3);

    assertEquals(6, expectedTotalPrice);
  }

  @Test
  void shouldReturn9PesosFor3Mangoes() {
    double expectedTotalPrice = productCostCalculator.compute("Mango", 3);

    assertEquals(9, expectedTotalPrice);
  }

  @Test
  void shouldThrowPriceNotFoundExceptionWhenNoCorrespondingPriceFound() {
    assertThrows(PriceNotFoundException.class, () -> productCostCalculator.compute("Tomato", 3));
  }
}
