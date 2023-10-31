package productcostcalculator;

public class ProductCostCalculator {

  double compute(String product, int quantity) {
    return quantity * ProductPriceEnum.getByProduct(product).getPrice();
  }
}
