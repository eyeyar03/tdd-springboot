package productcostcalculator;

public class ProductCostCalculator {

    public double compute(String product, int quantity) throws Exception {
        PriceService priceService = new PriceService();
        double productCost = priceService.getPriceByProductName(product);
        return productCost * quantity;
    }
}
