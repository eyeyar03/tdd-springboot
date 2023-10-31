package productcostcalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductCostCalculatorTest {

    private ProductCostCalculator productCostCalculator;

  @BeforeEach
  void setup() {
    PriceService priceService = new PriceService();
    productCostCalculator = new ProductCostCalculator(priceService);
  }

    @Test
    void shouldReturn6PesosFor3Apples() {
        Order order = Order.builder().product("Apple").quantity(3).build();
        double expectedTotalPrice = productCostCalculator.compute(order);

        assertEquals(6, expectedTotalPrice);
    }

    @Test
    void shouldReturn9PesosFor3Mangoes() {
        Order order = Order.builder().product("Mango").quantity(3).build();
        double expectedTotalPrice = productCostCalculator.compute(order);

        assertEquals(9, expectedTotalPrice);
    }

    @Test
    void shouldThrowNullPointersFor2Tomatoes() {
        Order order = Order.builder().product("Tomato").quantity(2).build();
        assertThrows(PriceNotFoundException.class, () ->  productCostCalculator.compute(order));
    }

}
