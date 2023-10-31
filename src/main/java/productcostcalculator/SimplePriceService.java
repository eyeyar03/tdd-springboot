package productcostcalculator;

public class SimplePriceService implements PriceService {

  @Override
  public double getPrice(String product) {
    double price;

    if ("Apple".equals(product)) {
      price = 2;
    } else if ("Mango".equals(product)) {
      price = 3;
    } else {
      throw new PriceNotFoundException();
    }

    return price;
  }
}
