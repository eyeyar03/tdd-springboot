package productcostcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductCostCalculator {
    @Test
    void shouldReturn6PesosFor3Apples() {
        ProductCostCalculatorTest productCostCalculator = new ProductCostCalculatorTest();
        double cost = productCostCalculator.compute("apple", 3);
        assertEquals(6, cost);
    }
}
