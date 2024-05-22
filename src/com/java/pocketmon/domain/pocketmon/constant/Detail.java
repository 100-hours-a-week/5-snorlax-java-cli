package com.java.pocketmon.domain.pocketmon.constant;

import java.util.Arrays;

public enum Detail {

    MOBUGI(1, "모부기", Type.GRASS,"초록", 0.4f, 10.2f),
    FIRE_SOONGE(2, "불꽃숭이", Type.FIRE, "갈색", 0.5f, 6.2f),
    PANGDORI(3, "팽도리", Type.WATER, "파랑", 0.4f, 5.2f),
    SUPER_MOBUGI(4, "수풀부기", Type.GRASS,"초록", 1.1f, 97f),
    SUPER_FIRE_SOONGE(5, "파이숭이", Type.FIRE, "갈색", 0.9f, 22f),
    SUPER_PANGDORI(6, "팽태자", Type.WATER, "파랑", 0.8f, 23f);

    private final int num;
    private final String name;
    private final Type type;
    private final String color;
    private final float height;
    private final float weight;

    Detail(int num, String name, Type type, String color, float height, float weight){
        this.num = num;
        this.name = name;
        this.type = type;
        this.color = color;
        this.height = height;
        this.weight = weight;
    }

    public static Detail getByNum(int num){
        return Arrays.stream(Detail.values()).filter(e -> e.num == num).findFirst().orElseThrow();
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }
}
