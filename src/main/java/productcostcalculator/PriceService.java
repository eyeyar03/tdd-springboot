package productcostcalculator;

import org.springframework.stereotype.Service;

@Service
public class PriceService {

    public double getPriceByProductName(String product) throws Exception {
        double price = 0;
        if(ProductListingEnum.valueOf(product) != null){
            price = ProductListingEnum.valueOf(product).price;
        } else {
            throw new Exception();
        }
        return price;
    }
}
