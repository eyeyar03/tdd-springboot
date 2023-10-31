package produccostcalculator;
import org.junit.jupiter.api.Test;
import productcostcalculator.ProductCostCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductCostCalculatorTests {

    @Test
    void testComputePriceFor3apples(){
        ProductCostCalculator productCostCalculator = new ProductCostCalculator();
        int total = productCostCalculator.compute("Apples", 3);
        assertEquals(6,total);
    }
}
