package produccostcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductEnumCostCalculatorTest {

  @Test
  void shouldReturn6PesosFor2Apples() {
    ProductCostCalculator productCostCalculator = new ProductCostCalculator();

    int actual = productCostCalculator.compute("Apple", 2);

    assertEquals(6, actual);
  }
}
