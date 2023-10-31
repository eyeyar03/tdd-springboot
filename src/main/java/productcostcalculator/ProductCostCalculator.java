package productcostcalculator;

import java.util.Optional;

public class ProductCostCalculator {

  double compute(String product, int quantity) throws PriceNotFoundException {
      ProductPriceEnum productPriceEnum =
        Optional.ofNullable(ProductPriceEnum.getByProduct(product))
            .orElseThrow(() -> new PriceNotFoundException());

    return quantity * productPriceEnum.getPrice();
  }
}
