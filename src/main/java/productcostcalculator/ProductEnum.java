package productcostcalculator;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum ProductEnum {
    APPLE("Apple", 2),
    MANGO("Mango", 3);

    private String name;
    private double price;

    private static final Map<String, ProductEnum> PRODUCT_MAP;

    static {
        PRODUCT_MAP =
                Arrays.stream(values())
                        .collect(Collectors.toMap(ProductEnum::getName, Function.identity()));
    }

    public static ProductEnum getProductEnum(String product) {
        return PRODUCT_MAP.get(product);
    }


    ProductEnum(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
