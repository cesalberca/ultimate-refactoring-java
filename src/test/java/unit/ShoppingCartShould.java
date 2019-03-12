package unit;

import implementationChange.ShoppingCart;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartShould {
    @Test
    public void count_number_of_products() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(10);

        Assert.assertEquals(1, shoppingCart.numberOfProducts());
    }

    @Test
    public void calculate_total_price_products_using_list() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        List<Integer> prices = new ArrayList<>();
        prices.add(1);
        prices.add(2);
        shoppingCart.add(prices);

        Assert.assertEquals(3, shoppingCart.calculateTotalPrice());
    }

    @Test
    public void calculate_total_price() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(10);

        Assert.assertEquals(10, shoppingCart.calculateTotalPrice());
    }

    @Test
    public void know_when_is_discount_applicable() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(100);

        Assert.assertTrue(shoppingCart.hasDiscount());
    }

    @Test
    public void know_when_is_not_possible_to_apply_discount() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(99);

        Assert.assertFalse(shoppingCart.hasDiscount());
    }

}
