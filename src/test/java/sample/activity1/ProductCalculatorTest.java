package sample.activity1;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductCalculatorTest {

    @Test
    public void testComputeApple(){
        ProductCalculator productCalculator = new ProductCalculator();
        int actualApplePrice = productCalculator.compute("apple",3);
        int expectedApplePrice = 6;
        assertEquals(expectedApplePrice,actualApplePrice);
    }

    private class ProductCalculator {
        public int compute(String condition, int pcs) {
            return 2 * pcs;
        }
    }
}
