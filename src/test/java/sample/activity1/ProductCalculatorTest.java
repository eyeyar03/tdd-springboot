package sample.activity1;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductCalculatorTest {

    @Test
    public void testCompute(){
        ProductCalculator productCalculator = new ProductCalculator();
        int result = productCalculator.compute("apple",3);
        assertEquals(6,1);
    }
}
