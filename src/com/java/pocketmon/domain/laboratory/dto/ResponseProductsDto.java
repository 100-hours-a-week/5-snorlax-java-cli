package com.java.pocketmon.domain.laboratory.dto;

import com.java.pocketmon.domain.pocketmon.constant.Detail;
import com.java.pocketmon.domain.pocketmon.constant.PocketMonInfo;
import com.java.pocketmon.domain.pocketmon.model.PocketMon;

public class ResponseProductsDto {
    private String name;
    private int price;

    public ResponseProductsDto(String name, int price){
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
