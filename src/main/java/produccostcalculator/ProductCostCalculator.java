package produccostcalculator;

public class ProductCostCalculator {

  public int compute(String product, int quantity) {
    ProductEnum productEnum = ProductEnum.getProductEnum(product);
    return quantity * productEnum.getCost();
  }
}
