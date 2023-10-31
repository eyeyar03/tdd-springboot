package produccostcalculator;
import org.junit.jupiter.api.Test;
import productcostcalculator.Order;
import productcostcalculator.PriceNotFoundException;
import productcostcalculator.ProductCostCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProductCostCalculatorTests {

    ProductCostCalculator productCostCalculator = new ProductCostCalculator();
    @Test
    void testComputePriceFor3Apples() throws PriceNotFoundException {
        int total = productCostCalculator.compute(new Order("Apple", 3));
        assertEquals(6, total);
    }

    @Test
    public void testComputePriceFor3Mangoes() throws PriceNotFoundException {
        int total = productCostCalculator.compute(new Order("Mango", 3));

        assertEquals(9, total);
    }

    @Test
    void testPriceNotFound() throws PriceNotFoundException {
        assertThrows(PriceNotFoundException.class,
                () -> productCostCalculator.compute(new Order("Tomato", 3))
        );
    }
}
