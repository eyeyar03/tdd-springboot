package productcostcalculator;

public class ProductCostCalculator {
  public double compute(String product, int quantity) {

    PriceService priceService = new SimplePriceService();
    double price = priceService.getPrice(product);

    return price * quantity;
  }
}
