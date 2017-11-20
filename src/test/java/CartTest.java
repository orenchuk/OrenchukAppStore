package test.java;

import main.java.Cart;
import org.junit.Test;

public class CartTest {

    Cart cart = new Cart();

    @Test
    public void ship() throws Exception {
        System.out.println("CartTest: You got an extra bonus");
    }

    @Test
    public void computeTotalPrice() throws Exception {
        System.out.println("ComputeTotalPriceText: total price = " + cart.computeTotalPrice());
    }

    @Test
    public void addElementToCart() throws Exception {
        System.out.println("addElementToCartTest");
    }

}