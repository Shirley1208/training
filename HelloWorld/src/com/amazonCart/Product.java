package com.amazonCart;

import java.text.NumberFormat;
import java.util.List;

public class Product {
    private String name;
    private int code;
    private double price;
    private double total;
    private int stock;
    private int quantity;

    public Product (String name, double price, int stock, int quantity){
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.quantity = quantity;
    }

    public static List<Product> newArrayList() {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double productPrice) {
        this.price = productPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}