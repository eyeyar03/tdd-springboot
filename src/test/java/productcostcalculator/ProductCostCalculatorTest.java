package productcostcalculator;

import exception.PriceNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProductCostCalculatorTest {

    private PriceService priceService;

    private ProductCostCalculator productCostCalculator;

    @BeforeEach
    public void setup() {
        priceService = new PriceService();
        productCostCalculator = new ProductCostCalculator(priceService);
    }

    @Test
    void shouldReturnComputedPriceFor3Apples() {
        double expectedTotalPrice = productCostCalculator.compute("Apple", 3);

        assertEquals(6, expectedTotalPrice);
    }

    @Test
    void shouldReturnComputedPriceFor3Mangoes() {
        double expectedTotalPrice = productCostCalculator.compute("Mango", 3);

        assertEquals(9, expectedTotalPrice);
    }

    @Test
    void shouldThrowAnErrorWhenPriceNotFound() {
        assertThrows(PriceNotFoundException.class, () -> productCostCalculator.compute("Tomato", 3));
    }

}
