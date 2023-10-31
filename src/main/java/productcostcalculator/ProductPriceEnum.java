package productcostcalculator;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum ProductPriceEnum {
    APPLE ("Apple", 2),

    MANGO ("Mango",3);

    private static final Map<String, ProductPriceEnum> PRICE_BY_TYPE_MAP;

    static {
        PRICE_BY_TYPE_MAP =
                Arrays.stream(values()).collect(Collectors.toMap(ProductPriceEnum::getProduct, Function.identity()));
    }

    private String product;

    private double price;

    ProductPriceEnum(String product, double price) {
        this.product = product;
        this.price = price;
    }

    public static ProductPriceEnum getByProduct(String product) {
        return PRICE_BY_TYPE_MAP.get(product);
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

}
