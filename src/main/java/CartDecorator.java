package main.java;

public abstract class CartDecorator {

    private Cart cart;

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public CartDecorator(Cart cart) {
        this.cart = cart;
    }
}
