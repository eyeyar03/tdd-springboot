package productcostcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProductCostCalculatorTest {

    Order order;

    @Test
    void shouldReturn6PesosFor3Apples() throws Exception {
        ProductCostCalculator productCostCalculator = new ProductCostCalculator();

        order = new Order("Apple", 3);
        double expectedTotalPrice = productCostCalculator.compute(order);

        assertEquals(6, expectedTotalPrice);
    }

    @Test
    void shouldReturn9PesosFor3Mangoes() throws Exception {
        ProductCostCalculator productCostCalculator = new ProductCostCalculator();

        order = new Order("Mango", 3);
        double expectedTotalPrice = productCostCalculator.compute(order);

        assertEquals(9, expectedTotalPrice);
    }

    @Test
    void shouldthrowExceptionIfProductIsTomato() {
        ProductCostCalculator productCostCalculator = new ProductCostCalculator();

        order = new Order("Tomato", 3);
        assertThrows(Exception.class, () -> productCostCalculator.compute(order));
    }

}
