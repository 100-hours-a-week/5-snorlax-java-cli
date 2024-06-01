package com.java.pocketmon.domain.pocketmon.model;

public class SuperPocketMon extends PocketMon{

    private int shy;

    public SuperPocketMon(String name) {
        super(name);
    }

    public void superShy(){
        shy += 1;
    }

}
