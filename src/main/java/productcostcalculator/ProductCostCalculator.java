package productcostcalculator;

public class ProductCostCalculator {

    public int compute(String name, int quantity){
        return switch (name) {
            case "Apples" -> 2 * quantity;
            case "Mangoes" -> 3 * quantity;
            case "Oranges" -> 4 * quantity;
            default -> throw new PriceNotFoundException();
        };
    }
}

