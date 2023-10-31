package productcostcalculator;

public class ProductCostCalculator {
  public double compute(String product, int quantity) {
    int price;

    if ("Apple".equals(product)) {
      price = 2;
    } else if ("Mango".equals(product)) {
      price = 3;
    } else {
      throw new PriceNotFoundException();
    }

    return price * quantity;
  }
}
