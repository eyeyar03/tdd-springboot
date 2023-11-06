package com.cognizant.masterclass.tddspringboot.hamcrest;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsEqual;
import com.cognizant.masterclass.tddspringboot.productcostcalculator.Order;

public class OrderMatcher extends TypeSafeMatcher<Order> {
  private final String expectedProduct;

  private final int expectedQuantity;

  private final Matcher<String> productMatcher;

  private final Matcher<Integer> quantityMatcher;

  private OrderMatcher(Order order) {
    this.expectedProduct = order.getProduct();
    this.expectedQuantity = order.getQuantity();
    this.productMatcher = IsEqual.equalTo(expectedProduct);
    this.quantityMatcher = IsEqual.equalTo(expectedQuantity);
  }

  public static Matcher<Order> isEqualToOrder(Order order) {
    return new OrderMatcher(order);
  }

  @Override
  protected boolean matchesSafely(Order order) {
    return productMatcher.matches(order.getProduct())
        && quantityMatcher.matches(order.getQuantity());
  }

  @Override
  public void describeTo(Description description) {
    description.appendText(
        String.format(
            "an order with %s product and %d quantity", expectedProduct, expectedQuantity));
  }

  @Override
  protected void describeMismatchSafely(Order order, Description mismatchDescription) {
    mismatchDescription.appendText(
        String.format(
            "an order with %s product and %d quantity", order.getProduct(), order.getQuantity()));
  }
}
