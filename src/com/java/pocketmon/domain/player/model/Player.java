package com.java.pocketmon.domain.player.model;

import com.java.pocketmon.domain.laboratory.model.Order;
import com.java.pocketmon.domain.pocketmon.model.PocketMon;
import java.util.HashMap;
import java.util.Map;

public class Player {
    private String name;
    private int point;
    private Map<String, Integer> products;
    private PocketMon pocketMon;

    public Player(String name){
        this.name = name;
        this.point = 1000;
        products = new HashMap<>();
    }

    public boolean registerPet(PocketMon pocketMon){
        if(pocketMon != null){
            return false;
        }

        this.pocketMon = pocketMon;
        return  true;
    }

    public void updateFightResult(){

    }

    public boolean buyProduct(Order order){
        if(point < order.getPrice()){
            return false;
        }

        point -= order.getPrice();
        products.put(order.getName(), products.getOrDefault(order.getName(), 0) + order.getCnt());
        return true;
    }

    public boolean useProduct(String name){
        if(products.getOrDefault(name, 0) == 0){
            return false;
        }

        products.put(name, products.get(name)-1);
        return true;
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }
}
