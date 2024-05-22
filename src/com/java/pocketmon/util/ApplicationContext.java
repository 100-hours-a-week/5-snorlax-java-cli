package com.java.pocketmon.util;

import com.java.pocketmon.domain.player.model.Player;

public class ApplicationContext {
    private static Player player;
    private static String pocketMonName;

    public static Player getPlayer() {
        return player;
    }

    public static String getPocketMonName() {
        return pocketMonName;
    }

    public static void setPlayer(Player player) {
        ApplicationContext.player = player;
    }

    public static void setPocketMonName(String name) {
        pocketMonName = name;
    }
}
