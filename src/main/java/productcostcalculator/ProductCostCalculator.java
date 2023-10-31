package productcostcalculator;

public class ProductCostCalculator {

    public double compute(Order order) throws Exception {
        PriceService priceService = new PriceService();
        double productCost = priceService.getPriceByProductName(order.getProduct());
        return productCost * order.getQuantity();
    }
}
