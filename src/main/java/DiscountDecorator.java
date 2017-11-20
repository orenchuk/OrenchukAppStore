package main.java;

public class DiscountDecorator extends CartDecorator {

    private double discount;
    private Cart cart;

    public double computeTotalPrice() {
        return cart.computeTotalPrice() * (1 - discount);
    }

    public DiscountDecorator(Cart cart, double discount) {
        super(cart);
        this.cart = cart;
        this.discount = discount;
    }
}
