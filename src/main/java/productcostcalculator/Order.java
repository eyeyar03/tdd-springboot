package productcostcalculator;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Order {
    String product;
    double quantity;
}
