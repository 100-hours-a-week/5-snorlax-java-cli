package com.java.pocketmon.domain.player.dto;

public class PlayerInfoDto {
    private String name;
    private int point;
    private String pocketMonName;

    public PlayerInfoDto(String name, int point, String pocketMonName) {
        this.name = name;
        this.point = point;
        this.pocketMonName = pocketMonName;
    }

    @Override
    public String toString() {
        return "PlayerInfo{" +
            "name='" + name + '\'' +
            ", point=" + point +
            ", pocketMonName='" + pocketMonName + '\'' +
            '}';
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }

    public String getPocketMonName() {
        return pocketMonName;
    }
}
