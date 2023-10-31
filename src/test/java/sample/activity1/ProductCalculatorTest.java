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

    @Test
    public void testComputeMango(){
        ProductCalculator productCalculator = new ProductCalculator();
        int actualMangoPrice = productCalculator.compute("mango", 3);
        int expectedMangoPrice = 9;
        assertEquals(expectedMangoPrice,actualMangoPrice);
    }

    private class ProductCalculator {
        public int compute(String condition, int pcs) {
            PriceService priceService = new PriceService();
            int price = 0;
            if(condition.equals("apple")){
                price = priceService.getApplePrice();
            } else if (condition.equals("mango")) {
                price = priceService.getMangoPrice();
            }
            return price * pcs;
        }
    }
}
