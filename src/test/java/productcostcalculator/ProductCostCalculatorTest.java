package productcostcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductCostCalculatorTest {

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
}
