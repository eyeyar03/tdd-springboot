package produccostcalculator;

public class ProductCostCalculator {

  private final PriceService priceService;

  public ProductCostCalculator(PriceService priceService) {
    this.priceService = priceService;
  }

  public int compute(String product, int quantity) {
    return quantity * priceService.getPrice(product);
  }
}
