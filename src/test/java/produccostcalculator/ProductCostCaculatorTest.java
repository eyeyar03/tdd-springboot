package produccostcalculator;

import exception.PriceNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProductEnumCostCalculatorTest {

  private ProductCostCalculator productCostCalculator;

  private PriceService priceService;

  @BeforeEach
  void init() {
    priceService = new PriceService();

    productCostCalculator = new ProductCostCalculator(priceService);
  }

  @Test
  void shouldReturn6PesosFor2Apples() {
    int actual = productCostCalculator.compute("Apple", 2);

    assertEquals(6, actual);
  }

  @Test
  void shouldReturn4PesosFor2Mangoes() {
    int actual = productCostCalculator.compute("Mango", 2);

    assertEquals(4, actual);
  }

  @Test
  void shouldThrowPriceNotFoundExceptionForTomatoesAsItDoesNotExist() {
    assertThrows(PriceNotFoundException.class, () -> productCostCalculator.compute("Tomato", 2));
  }
}
