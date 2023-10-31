package productcostcalculator;

public class ProductCostCalculator {
  public double compute(String product, int quantity) {
    int price;

    if("Apple".equals(product)) {
      price = 2;
    } else {
      price = 3;
    }
    return price * quantity;
  }
}
