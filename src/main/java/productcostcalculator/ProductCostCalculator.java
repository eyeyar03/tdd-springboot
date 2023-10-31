package productcostcalculator;

public class ProductCostCalculator {

    public double compute(String product, int quantity) throws Exception {
        double price = 1;

        if(product.equals("Apple")){
            price = 2;
        } else if(product.equals("Mango")){
            price = 3;
        } else {
            throw new Exception();
        }

        return price * quantity;
    }
}
