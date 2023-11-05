package productcostcalculator;

import org.springframework.stereotype.Service;

@Service
public class PriceService {

    public double getProductPriceByProductName(String productName) {
        ProductEnum productEnum = ProductEnum.getProductEnumByProductName(productName);
        return productEnum.getPrice();
    }


}
