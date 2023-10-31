package productcostcalculator;

import java.util.Optional;

public class PriceService {

  double getPrice(String product) throws PriceNotFoundException {
    ProductPriceEnum productPriceEnum =
        Optional.ofNullable(ProductPriceEnum.getByProduct(product))
            .orElseThrow(PriceNotFoundException::new);

    return productPriceEnum.getPrice();
  }
}
