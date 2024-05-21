package com.java.pocketmon.domain.laboratory.model;

public class Product {

    private String name;
    private int price;
    private int stock;
    private String explanation;


    public Product(String name, int price, String explanation){
        this.name = name;
        this.price = price;
        this.stock = 1000;
        this.explanation = explanation;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
