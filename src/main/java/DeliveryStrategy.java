package main.java;

import java.util.List;

public interface DeliveryStrategy {
    boolean deliver(List<App> appList);
}
