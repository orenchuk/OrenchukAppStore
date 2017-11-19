package main.java;

import java.util.ArrayList;

public class AppStoreTester {

    private static void printOut(App app) {
        System.out.println();
        System.out.println("Name: " + app.getName());
        System.out.println("Serial number: " + app.getSerialNumber());
        System.out.println("Description: " + app.getDescription());
        System.out.println("Price: " + app.getPrice());
        System.out.println("Size: " + app.getSize());
        System.out.println("Category: " + app.getCategoryStr());
    }

    private static void getInfoForSearch(AppStore store) {
        ArrayList<App> mathingApps;

        mathingApps = store.search("", 0.1, "", Category.GAMES);

        if (mathingApps != null) {
            for (App app : mathingApps) {
                printOut(app);
            }
        } else {
            System.out.println("Sorry, there is no such app in the store");
        }
    }

    public static void main(String[] args) {
        App snapchat = new App("Snapchat", "Just a cool app", 9.99, 555.5, Category.BUSINESS);

        App instagram = new App();
        instagram.setName("Instagram");
        instagram.setDescription("With this app you can waste your time even more");
        instagram.setPrice(2.99);
        instagram.setSize(9999.9);
        instagram.setCategory(Category.EDUCATION);

        App facebook = new App();

        AppStore store = new AppStore();
        store.addApp(snapchat);
        store.addApp(instagram);
        store.addApp(facebook);
        store.addApp("Telegram", 0.0, "Cool messenger", Category.UTILITIES, 10.0);

        getInfoForSearch(store);

        for (App app : store.apps) {
            printOut(store.getApp(app.getSerialNumber()));
        }
    }
}
