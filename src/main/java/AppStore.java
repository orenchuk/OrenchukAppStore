package main.java;

import java.util.ArrayList;
import java.util.Locale;

public class AppStore {
    public ArrayList<App> apps;

    public void addApp(String name, double price, String description, Category category, double size) {
        App newApp = new App(name, description, price, size, category);
        apps.add(newApp);
    }

    public void addApp(App app) {
        apps.add(app);
    }

    public App getApp(String id) {
        for (App app : apps) {
            if (app.getSerialNumber().equals(id)) { return app; }
        }
        return null;
    }

    public ArrayList<App> search(String name, double price, String description, Category category) {

        ArrayList<App> mathingApps = new ArrayList<>();

        for (App app : apps) {

            if (app.getName().toLowerCase(Locale.US).equals(name.toLowerCase(Locale.US)) || app.getDescription().toLowerCase(Locale.US).equals(description.toLowerCase(Locale.US)) || app.getCategory().equals(category)) {
                mathingApps.add(app);
            }
        }

        return mathingApps.isEmpty() ? null : mathingApps;
    }

    public AppStore() {
        apps = new ArrayList<>();
    }
}
