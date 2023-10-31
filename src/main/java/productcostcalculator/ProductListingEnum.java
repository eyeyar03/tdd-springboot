package productcostcalculator;

public enum ProductListingEnum {
    Apple(2),
    Mango(3);

    public final double price;

    private ProductListingEnum(double price){
        this.price = price;
    }
}
