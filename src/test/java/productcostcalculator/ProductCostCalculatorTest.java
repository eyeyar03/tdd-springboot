package productcostcalculator;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductCostCalculatorTest {

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
    void shouldThrowNullPointersFor2Tomatoes() {
        ProductCostCalculator productCostCalculator = new ProductCostCalculator();

        assertThrows(PriceNowFoundException.class, () ->  productCostCalculator.compute("Tomato", 2));
    }

}
