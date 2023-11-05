package productcostcalculator;

public class PriceService {

    public double getProductPriceByProductName(String productName) {
        ProductEnum productEnum = ProductEnum.getProductEnumByProductName(productName);
        return productEnum.getPrice();
    }


}
