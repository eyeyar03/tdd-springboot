package productcostcalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ProductCostCalculatorTest {

    private ProductCostCalculator productCostCalculator;

  @BeforeEach
  void setup() {
    PriceService priceService = new PriceService();
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
    void shouldThrowNullPointersFor2Tomatoes() {

        assertThrows(PriceNotFoundException.class, () ->  productCostCalculator.compute("Tomato", 2));
    }

}
