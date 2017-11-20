package main.java;

import java.util.List;

public class DeliveryDHL implements DeliveryStrategy {
    @Override
    public boolean deliver(List<App> appList) {
        for (App app : appList) {
            System.out.println("DHL: " + app.getName() + " has been delivered");
        }
        return true;
    }
}
