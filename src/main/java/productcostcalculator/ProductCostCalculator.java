package productcostcalculator;

public class ProductCostCalculator {

  private final PriceService priceService;

  public ProductCostCalculator(PriceService priceService) {
    this.priceService = priceService;
  }

  public double compute(Order order) {
    double price = priceService.getPrice(order.getProduct());

    return price * order.getQuantity();
  }
}
