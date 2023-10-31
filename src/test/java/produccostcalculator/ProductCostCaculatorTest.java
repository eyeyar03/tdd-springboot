package produccostcalculator;

import exception.PriceNotFoundException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProductEnumCostCalculatorTest {

  @Test
  void shouldReturn6PesosFor2Apples() {
    ProductCostCalculator productCostCalculator = new ProductCostCalculator();

    int actual = productCostCalculator.compute("Apple", 2);

    assertEquals(6, actual);
  }

  @Test
  void shouldReturn4PesosFor2Mangoes() {
    ProductCostCalculator productCostCalculator = new ProductCostCalculator();

    int actual = productCostCalculator.compute("Mango", 2);

    assertEquals(4, actual);
  }

  @Test
  void shouldThrowPriceNotFoundExceptionForTomatoesAsItDoesNotExist() {
    ProductCostCalculator productCostCalculator = new ProductCostCalculator();

    assertThrows(PriceNotFoundException.class, () -> productCostCalculator.compute("Tomato", 2));
  }
}
