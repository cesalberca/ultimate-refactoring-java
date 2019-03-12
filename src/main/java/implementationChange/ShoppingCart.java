package implementationChange;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private static final int MINIMUM_DISCOUNT_PRICE = 100;

    private List<Integer> prices = new ArrayList<>();

    public void add(int price) {
        this.prices.add(price);
    }

    public int calculateTotalPrice() {
        return prices.stream().reduce(0, Integer::sum);
    }

    public boolean hasDiscount() {
        return this.calculateTotalPrice() >= MINIMUM_DISCOUNT_PRICE;
    }

    public int numberOfProducts() {
        return prices.size();
    }
}
