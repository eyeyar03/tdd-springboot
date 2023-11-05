package productcostcalculator;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductCostCalculator {

    private final PriceService priceService;

    @Autowired
    public ProductCostCalculator(PriceService priceService) {
        this.priceService = priceService;
    }

    public double compute(Order order) {

        return priceService.getProductPriceByProductName(order.getProduct()) * order.getQuantity();
    }
}
