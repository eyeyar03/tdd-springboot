package productcostcalculator;

import exception.PriceNotFoundException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

        double expectedTotalPrice = productCostCalculator.compute("Mango", 3);

        assertEquals(9, expectedTotalPrice);
    }

    @Test
    void shouldThrowAnErrorWhenPriceNotFound() {
        ProductCostCalculator productCostCalculator = new ProductCostCalculator();

        assertThrows(PriceNotFoundException.class, () -> productCostCalculator.compute("Tomato", 3));
    }

}
