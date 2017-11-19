package main.java;

import java.util.Locale;

public class App {
    private String serialNumber, name, description;
    private double price, size;
    private Category category;

    public String getSerialNumber() {
        return serialNumber;
    }

    private void setSerialNumber() {
        String productName = getName();
        serialNumber = productName.toUpperCase(Locale.US);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        setSerialNumber();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Category getCategory() {
        return category;
    }

    public String getCategoryStr() {
        return category.toString();
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public App(String name, String description, double price, double size, Category category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.size = size;
        this.category = category;
        setSerialNumber();
    }

    public App() {
        this.name = "No name";
        this.description = "No description";
        this.price = 0.0;
        this.size = 0.0;
        this.category = Category.OTHER;
        setSerialNumber();
    }
}


