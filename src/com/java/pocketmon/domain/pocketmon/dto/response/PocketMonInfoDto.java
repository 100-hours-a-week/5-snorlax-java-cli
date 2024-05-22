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
        this.image = PocketMonInfo.getByName(pocketMon.getDetail().getName()).getShapeCode();
        this.name = pocketMon.getName();
        this.exp = pocketMon.getExp();
        this.power = pocketMon.getPower();
        this.performanceCnt = pocketMon.getPerformanceCnt();
        this.detail = pocketMon.getDetail();
    }

    @Override
    public String toString() {
        return "포켓몬 정보{" +
            "image='" + image + '\'' +
            ", name='" + name + '\'' +
            ", exp=" + exp +
            ", power=" + power +
            ", performanceCnt=" + performanceCnt +
            ", detail=" + detail +
            '}';
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
