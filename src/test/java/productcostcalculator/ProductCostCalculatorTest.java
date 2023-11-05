package productcostcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductCostCalculatorTest {

    @Test
    void shouldReturnComputedPriceFor3Apples() {
        ProductCostCalculator productCostCalculator = new ProductCostCalculator();

        double expectedTotalPrice = productCostCalculator.compute("Apple", 3);

        assertEquals(6, expectedTotalPrice);
    }

    @Test
    void shouldReturnComputedPriceFor3Mangoes() {
        ProductCostCalculator productCostCalculator = new ProductCostCalculator();

        double expectedTotalPrice = productCostCalculator.compute("Mangoes", 3);

        assertEquals(9, expectedTotalPrice);
    }

}
