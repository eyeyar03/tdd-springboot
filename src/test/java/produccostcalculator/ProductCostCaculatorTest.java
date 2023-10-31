package produccostcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductCostCalculatorTest {

  @Test
  void shouldReturn6PesosFor3Apples() {
    ProductCostCalculator productCostCalculator = new ProductCostCalculator();

    int actual = productCostCalculator.compute("", 3);

    assertEquals(6, actual);
  }
}
