package com.java.pocketmon.domain.laboratory.model;

public class Order {
    private String name;
    private int price;
    private int cnt;

    public Order(String name, int price, int cnt){
        this.name = name;
        this.price = price;
        this.cnt = cnt;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCnt() {
        return cnt;
    }
}
