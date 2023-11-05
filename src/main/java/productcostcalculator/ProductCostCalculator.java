package productcostcalculator;

public class ProductCostCalculator {
    public double compute(String product, int quantity) {
        ProductEnum productEnum = ProductEnum.getProductEnumByProductName(product);
        return productEnum.getPrice() * quantity;
    }
}
