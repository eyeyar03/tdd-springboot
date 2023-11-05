package productcostcalculator;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductCostCalculator {

    private final PriceService priceService;

    @Autowired
    public ProductCostCalculator(PriceService priceService) {
        this.priceService = priceService;
    }

    public double compute(String product, int quantity) {

        return priceService.getProductPriceByProductName(product) * quantity;
    }
}
