package main.java;

import java.util.List;

public class DeliveryNovaPoshta implements DeliveryStrategy {
    @Override
    public boolean deliver(List<App> appList) {
        for (App app : appList) {
            System.out.println("NovaPoshta: " + app.getName() + " has been delivered");
        }
        return true;
    }
}
