package main.java;

public class Privat24Payment implements PaymentStrategy{

    @Override
    public boolean pay(double amount) {
        System.out.println("You paid: " + amount + " uah");
        return amount > 0 ? true : false;
    }
}
