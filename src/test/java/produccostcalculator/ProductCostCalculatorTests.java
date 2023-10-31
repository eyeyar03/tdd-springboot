package produccostcalculator;
import org.junit.jupiter.api.Test;
import productcostcalculator.ProductCostCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProductCostCalculatorTests {

    ProductCostCalculator productCostCalculator = new ProductCostCalculator();
    @Test
    void testComputePriceFor3apples(){
        int total = productCostCalculator.compute("Apples", 3);
        assertEquals(6,total);
    }
    void testPriceNotFound(){
        assertThrows(PriceNotFoundException, productCostCalculator.compute("Tomato", 3));
    }
}
