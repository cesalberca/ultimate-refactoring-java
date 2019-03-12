package implementationChange;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Price> prices = new ArrayList<>();

    public void add(Price price) {
        this.prices.add(price);
    }

    public Price calculateTotal(){
        return new Price(prices.stream().mapToInt(p->p.getValue()).sum());
    }
    public boolean hasDiscount() {
        return calculateTotal().getValue() >= 100;
    }

    public int numberOfProducts() {
        return prices.size();
    }
}
