package com.java.pocketmon.domain.gym.dto;

public class FightResultDto {
    private boolean isWinner;
    private int point;
    private int exp;

    public FightResultDto(boolean isWinner, int point, int exp){
        this.isWinner = isWinner;
        this.point = point;
        this.exp = exp;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public int getPoint() {
        return point;
    }

    public int getExp() {
        return exp;
    }
}
