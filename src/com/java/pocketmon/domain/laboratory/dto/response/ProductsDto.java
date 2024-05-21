package com.java.pocketmon.domain.laboratory.dto.response;

public class ProductsDto {
    private String name;
    private int price;

    public ProductsDto(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
