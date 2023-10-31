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
    Order order = new Order("Apple", 2);
    int actual = productCostCalculator.compute(order);

    assertEquals(6, actual);
  }

  @Test
  void shouldReturn4PesosFor2Mangoes() {
    Order order = new Order("Mango", 2);
    int actual = productCostCalculator.compute(order);

    assertEquals(4, actual);
  }

  @Test
  void shouldThrowPriceNotFoundExceptionForTomatoesAsItDoesNotExist() {
    Order order = new Order("Tomato", 2);
    assertThrows(PriceNotFoundException.class, () -> productCostCalculator.compute(order));
  }
}
