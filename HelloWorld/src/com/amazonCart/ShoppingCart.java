package com.amazonCart;

import com.amazonCart.Product;

import java.util.List;

public class ShoppingCart {
    List<Product> products;
    private int itemCount;
    private double totalPrice;

    public ShoppingCart() {
        this.products = Product.newArrayList();
    }

    public void addToCart(Product product) {
        this.products.add(product);
    }

    public void removeFromCart(Product product) {
        this.products.remove(product);
    }

    public int countTotal() {
        int sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        return sum;
    }

    public double totalPrice() {
        int total = 0;
        for (Product product : products) {
            total += (product.getQuantity() * product.getPrice());
        }
        return total;
    }
}


    //methods/operations
/*
    public void add (int item){
        //create API->post

    }
    public void remove (int item){
        //delete API->delete
    }
    public void update (int item){
        //update API->put
    }
    public void view (int item){
        //read API->get
    }
    public void save (int item){}
    public void emptyCart (int item){}
    */

