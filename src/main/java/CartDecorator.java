package main.java;

public abstract class CartDecorator {

    private Cart cart;

    public CartDecorator(Cart cart) {
        this.cart = cart;
    }
}
