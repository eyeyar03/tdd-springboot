package productcostcalculator;

public class ProductService {

    public int GetPrice(String name) throws PriceNotFoundException {
        return switch (name) {
            case "Apple" -> 2;
            case "Mango" -> 3;
            case "Orange" -> 4;
            default -> throw new PriceNotFoundException();
        };
    }
}
