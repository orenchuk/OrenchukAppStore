package main.java;

public class BonusDecorator extends CartDecorator {

    private Cart cart;
    private App bonus;

    public boolean ship() {
        System.out.println("You got an extra bonus");
        cart.addElementToCart(bonus);
        cart.ship();
        return true;
    }

    public BonusDecorator(Cart cart, App bonus) {
        super(cart);
        this.bonus = bonus;
        this.cart = cart;
    }
}
