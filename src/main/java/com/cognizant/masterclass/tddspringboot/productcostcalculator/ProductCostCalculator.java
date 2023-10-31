package com.cognizant.masterclass.tddspringboot.productcostcalculator;

public class ProductCostCalculator {

  private final PriceService priceService;

  public ProductCostCalculator(PriceService priceService) {
    this.priceService = priceService;
  }

  public double compute(Order order) {
    DiscountService discountService = new SimpleDiscountService();

    double price = priceService.getPrice(order.getProduct());

    double discount = discountService.getDiscount(order.getDiscountCode(), order.getProduct());

    double totalPrice = price * order.getQuantity();

    return totalPrice - (totalPrice * discount);
  }
}
