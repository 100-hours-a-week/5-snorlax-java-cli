package com.java.pocketmon.domain.gym.constant;

public enum FightResult {

    WINNER(500, 350),
    LOSER(100, 100);

    private final int point;
    private final int exp;

    FightResult(int point, int exp){
        this.point = point;
        this.exp = exp;
    }

    public int getPoint() {
        return point;
    }

    public int getExp() {
        return exp;
    }
}
