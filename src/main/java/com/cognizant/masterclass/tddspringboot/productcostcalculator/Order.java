package com.cognizant.masterclass.tddspringboot.productcostcalculator;

public class Order {

  private String product;

  private int quantity;

  private String discountCode;

  private Order(String product, int quantity) {
    this.product = product;
    this.quantity = quantity;
  }

  private Order(String product, int quantity, String discountCode) {
    this(product, quantity);
    this.discountCode = discountCode;
  }

  public static Order of(String product, int quantity) {
    return new Order(product, quantity);
  }

  public static Order of(String product, int quantity, String discountCode) {
    return new Order(product, quantity, discountCode);
  }

  public String getProduct() {
    return product;
  }

  public int getQuantity() {
    return quantity;
  }

  public String getDiscountCode() {
    return discountCode;
  }
}
