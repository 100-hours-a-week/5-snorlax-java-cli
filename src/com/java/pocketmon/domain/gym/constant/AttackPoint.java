package com.java.pocketmon.domain.gym.constant;

import java.util.Arrays;

public enum AttackPoint {
    HEAD(1), BODY(2), LEG(3);

    private final int num;
    AttackPoint(int num){
        this.num = num;
    }

    public static AttackPoint getByNum(int num){
        return Arrays.stream(AttackPoint.values()).filter(e -> e.num == num).findFirst().orElseThrow();
    }
}
