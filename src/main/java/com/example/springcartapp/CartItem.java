package com.example.springcartapp;

public class CartItem {
    private String name;
    private double price;

    private String image;

    private int quantity;
    public CartItem(String name, double price, String image) {
        this.name = name;
        this.price = price;
        this.image = image;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
