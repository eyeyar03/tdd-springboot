package productcostcalculator;

public class ProductCostCalculator {

    PriceService priceService = new PriceService();

    public double compute(String product, int quantity) {

        return priceService.getProductPriceByProductName(product) * quantity;
    }
}
