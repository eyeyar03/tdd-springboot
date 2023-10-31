package productcostcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProductCostCalculatorTest {

    @Test
    void shouldReturn6PesosFor3Apples() throws Exception {
        ProductCostCalculator productCostCalculator = new ProductCostCalculator();

        double expectedTotalPrice = productCostCalculator.compute("Apple", 3);

        assertEquals(6, expectedTotalPrice);
    }

    @Test
    void shouldReturn9PesosFor3Mangoes() throws Exception {
        ProductCostCalculator productCostCalculator = new ProductCostCalculator();

        double expectedTotalPrice = productCostCalculator.compute("Mango", 3);

        assertEquals(9, expectedTotalPrice);
    }

    @Test
    void shouldthrowExceptionIfProductIsTomato() {
        ProductCostCalculator productCostCalculator = new ProductCostCalculator();

        assertThrows(Exception.class, () -> productCostCalculator.compute("Tomato", 3));
    }

}
