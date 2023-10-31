package productcostcalculator;

public class ProductCostCalculator {
    ProductService productService = new ProductService();

    public int compute(Order order) throws PriceNotFoundException {
        return order.quantity * productService.GetPrice(order.product);
    }
}

