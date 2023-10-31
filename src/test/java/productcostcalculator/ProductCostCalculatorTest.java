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
    Order order = Order.of("Apple", 3);

    double expectedTotalPrice = productCostCalculator.compute(order);

    assertEquals(6, expectedTotalPrice);
  }

  @Test
  void shouldReturnDiscountedPriceFor3Apples() {
    Order order = Order.of("Apple", 3, "Apple20");

    double expectedTotalPrice = productCostCalculator.compute(order);

    assertEquals(4.8, expectedTotalPrice);
  }

  @Test
  void shouldReturn9PesosFor3Mangoes() {
    Order order = Order.of("Mango", 3);

    double expectedTotalPrice = productCostCalculator.compute(order);

    assertEquals(9, expectedTotalPrice);
  }

  @Test
  void shouldThrowPriceNotFoundExceptionWhenNoCorrespondingPriceFound() {
    Order order = Order.of("Tomato", 3);

    assertThrows(PriceNotFoundException.class, () -> productCostCalculator.compute(order));
  }
}
