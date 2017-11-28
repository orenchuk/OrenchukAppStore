package main.java.Observer;

import main.java.Cart;

public abstract class User implements Observer {

    private Cart cart;

    public User() {
        this.cart = new Cart();
    }

    @Override
    public boolean update() {
        return true;
    }

    public Cart getCart() {
        return cart;
    }
}
