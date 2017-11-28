package main.java;

import main.java.Observer.Observable;

import java.util.ArrayList;
import java.util.List;

public class Cart extends Observable {
    private List<App> goods;
    private PaymentStrategy paymentStrategy;
    private DeliveryStrategy deliveryStrategy;

    public Cart(PaymentStrategy paymentStrategy, DeliveryStrategy deliveryStrategy) {
        goods = new ArrayList<>();
        this.paymentStrategy = paymentStrategy;
        this.deliveryStrategy = deliveryStrategy;
    }

    public Cart() {
        goods = new ArrayList<>();
    }

    public boolean ship() {
        System.out.println("Your delivery has been shipped");
        return true;
    }

    public double computeTotalPrice() {
        double totalPrice = 0.0;

        for (App good : goods) {
            totalPrice += good.getPrice();
        }

        return totalPrice;
    }

    public boolean addElementToCart(App app) {
        goods.add(app);
        return true;
    }


    public DeliveryStrategy getDeliveryStrategy() {
        return deliveryStrategy;
    }

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
