package com.java.pocketmon.domain.pocketmon.dto.response;

import com.java.pocketmon.domain.pocketmon.constant.Detail;
import com.java.pocketmon.domain.pocketmon.constant.PocketMonInfo;
import com.java.pocketmon.domain.pocketmon.model.PocketMon;

public class PocketMonInfoDto {
    private String image;
    private String name;
    private int exp;
    private int power;
    private int performanceCnt;
    private Detail detail;

    public PocketMonInfoDto(PocketMon pocketMon){
        this.image = PocketMonInfo.getByName(pocketMon.getName()).getShapeCode();
        this.name = pocketMon.getName();
        this.exp = pocketMon.getExp();
        this.power = pocketMon.getPower();
        this.performanceCnt = pocketMon.getPerformanceCnt();
        this.detail = pocketMon.getDetail();
    }

    public String getImage() {
        return image;
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
}
