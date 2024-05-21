package com.java.pocketmon.domain.pocketmon.constant;

public enum Detail {

    MOBUGI("모부기", Type.GRASS,"초록", 0.4f, 10.2f),
    FIRE_SOONGE("불꽃숭이", Type.FIRE, "갈색", 0.5f, 6.2f),
    PANGDORI("팽도리", Type.WATER, "파랑", 0.4f, 5.2f),
    SUPER_MOBUGI("수풀부기", Type.GRASS,"초록", 1.1f, 97f),
    SUPER_FIRE_SOONGE("파이숭이", Type.FIRE, "갈색", 0.9f, 22f),
    SUPER_PANGDORI("팽태자", Type.WATER, "파랑", 0.8f, 23f);

    private final String name;
    private final Type type;
    private final String color;
    private final float height;
    private final float weight;

    Detail(String name, Type type, String color, float height, float weight){
        this.name = name;
        this.type = type;
        this.color = color;
        this.height = height;
        this.weight = weight;
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

//enum Type {
//    WATER("물", 1), FIRE("불", 2), GRASS("풀", 3);
//
//    private final String name;
//    private final int priority;
//    Type(String name, int priority){
//        this.name = name;
//        this.priority = priority;
//    }
//
//    public String getName() {
//        return name;
//    }
//    public int getPriority() {
//        return priority;
//    }
//}