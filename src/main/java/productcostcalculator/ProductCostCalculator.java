package productcostcalculator;

import java.util.Optional;

public class ProductCostCalculator {

  private final PriceService priceService;

  public ProductCostCalculator(PriceService priceService) {
    this.priceService = priceService;
  }

  double compute(Order order) {
    return order.getQuantity() * priceService.getPrice(order.product);
  }
}
