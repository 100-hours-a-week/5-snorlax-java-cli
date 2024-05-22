package com.java.pocketmon.domain.pocketmon.model;

import com.java.pocketmon.domain.pocketmon.constant.Detail;
import com.java.pocketmon.domain.pocketmon.constant.ExceptionMessage;
import com.java.pocketmon.domain.pocketmon.constant.PocketMonInfo;
import com.java.pocketmon.domain.pocketmon.dto.response.PocketMonInfoDto;

public class PocketMon {
    private String name;
    private int exp;
    private int power;
    private int performanceCnt;
    private Detail detail;

    public PocketMon(String name){
        this.name = name;
        this.power = 100;
    }

    public String performance() {
        if(performanceCnt == 0){
            return ExceptionMessage.NOT_ENOUGH_PERFORMANCE;
        }
        performanceCnt -=1;
        return PocketMonInfo.getByName(detail.getName()).getPerformanceMessage();
    }

    public void eatSnack(){
        performanceCnt += 1;
        power += 10;
    }

    public String cry(){
        power -= 1;
        return PocketMonInfo.getByName(detail.getName()).getCryMessage();
    }

    public void getDamage(int attack){
        power = Math.max(power - attack, 0);
    }

    public boolean isAdventageous(PocketMon opponent){
        int myPriority = detail.getType().getPriority();
        int oppPriority = opponent.getDetail().getType().getPriority();
        return myPriority < oppPriority && oppPriority - myPriority == 1;
    }

    public PocketMonInfoDto getInfo(){
        return new PocketMonInfoDto(this);
    }

    public String getName() {
        return name;
    }

    public int getExp() {
        return exp;
    }

    public int getPower() {
        return power;
    }

    public int getPerformanceCnt() {
        return performanceCnt;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public PocketMon evolve(){
        return this;
    }
}
