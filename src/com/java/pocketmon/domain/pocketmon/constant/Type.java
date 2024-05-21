package com.java.pocketmon.domain.pocketmon.constant;

public enum Type {
    WATER("물", 1), FIRE("불", 2), GRASS("풀", 3);

    private final String name;
    private final int priority;
    Type(String name, int priority){
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }
    public int getPriority() {
        return priority;
    }
}
