package productcostcalculator;

public class SimpleDiscountService implements DiscountService {

  @Override
  public double getDiscount(String discountCode) {
    double discount = 0;

    if ("Apple20".equals(discountCode)) {
      discount = .20;
    }

    return discount;
  }
}
