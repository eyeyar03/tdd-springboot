package productcostcalculator;

public class ProductCostCalculator {

  private final PriceService priceService;

  public ProductCostCalculator(PriceService priceService) {
    this.priceService = priceService;
  }

  public double compute(String product, int quantity) {
    double price = priceService.getPrice(product);

    return price * quantity;
  }
}
