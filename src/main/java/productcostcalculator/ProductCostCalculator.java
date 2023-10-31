package productcostcalculator;

public class ProductCostCalculator {
    public double compute(String product, int quantity){
        int price = 1;
        if(product.equalsIgnoreCase("apple")){
            price = 2;
        }else if(product.equalsIgnoreCase("mango")){
            price = 3;
        }else{
            throw new RuntimeException();
        }
        return price * quantity;
    }
}
