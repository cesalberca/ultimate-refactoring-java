package implementationChange;

import java.util.List;

public class ShoppingCart {
    private int price;
    private List<Integer> prices;
    public static final int MINIMUM_DISCOUNT_PRICE = 100;

    @Deprecated
    public void add(int price) {
        this.price = price;
    }

    public void add(List<Integer> prices) {
        this.prices = prices;
    }

    public int calculateTotalPrice() {
        if (prices != null) {
            return prices.stream().reduce(0, Integer::sum);
        }
        return price;
    }

    public boolean hasDiscount() {
        if (prices != null) {
            return this.calculateTotalPrice() >= MINIMUM_DISCOUNT_PRICE;
        }
        return price >= MINIMUM_DISCOUNT_PRICE;
    }

    public int numberOfProducts() {
        if (prices != null) {
            return prices.size();
        }
        return 1;
    }
}
