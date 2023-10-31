package productcostcalculator;

public class Order {

  private String product;

  private int quantity;

  private Order(String product, int quantity) {
    this.product = product;
    this.quantity = quantity;
  }

  public static Order of(String product, int quantity) {
    return new Order(product, quantity);
  }

  public String getProduct() {
    return product;
  }

  public int getQuantity() {
    return quantity;
  }
}
