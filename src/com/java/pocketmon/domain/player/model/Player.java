package com.java.pocketmon.domain.player.model;

import com.java.pocketmon.domain.laboratory.model.Order;
import com.java.pocketmon.domain.player.dto.PlayerInfoDto;
import com.java.pocketmon.domain.pocketmon.model.PocketMon;
import com.java.pocketmon.util.ApplicationContext;
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
        ApplicationContext.setPlayer(this);
    }

    public boolean registerPet(PocketMon pocketMon){
        if(pocketMon != null){
            return false;
        }

        this.pocketMon = pocketMon;
        return  true;
    }

    public boolean buyProduct(Order order){
        if(point < order.getPrice() * order.getCnt()){
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

    public PlayerInfoDto getInfo(){
        return new PlayerInfoDto(name, point, pocketMon.getName());
    }

    public void savePoint(int point){
        this.point += point;
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }

    public PocketMon getPocketMon() {
        return pocketMon;
    }

    public void setPocketMon(PocketMon pocketMon) {
        this.pocketMon = pocketMon;
    }
}
