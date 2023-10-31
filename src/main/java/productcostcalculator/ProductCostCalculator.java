package productcostcalculator;

import java.util.Optional;

public class ProductCostCalculator {

  private final PriceService priceService;

  public ProductCostCalculator(PriceService priceService) {
    this.priceService = priceService;
  }

  double compute(String product, int quantity) {
    return quantity * priceService.getPrice(product);
  }
}
