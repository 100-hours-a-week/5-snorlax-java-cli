package com.java.pocketmon.view;

import static com.java.pocketmon.view.constant.GameMessage.INPUT_PLAYER_NAME;
import static com.java.pocketmon.view.constant.GameMessage.INPUT_POCKETMON_NAME;
import static com.java.pocketmon.view.constant.GameMessage.POCKETMON_DETAIL;
import static com.java.pocketmon.view.constant.GameMessage.SELECT_ATTACK_POINT;
import static com.java.pocketmon.view.constant.GameMessage.SELECT_GYM_MENU;
import static com.java.pocketmon.view.constant.GameMessage.SELECT_MAIN_MENU;
import static com.java.pocketmon.view.constant.GameMessage.SELECT_POCKETMON_MESSAGE;
import static com.java.pocketmon.view.constant.GameMessage.SELECT_PRODUCT;

import com.java.pocketmon.domain.pocketmon.constant.Detail;
import com.java.pocketmon.util.ApplicationContext;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String inputUserName() throws IOException {
        println(INPUT_PLAYER_NAME);
        return br.readLine();
    }

    public static String selectPocketMon() throws IOException {
        println(String.format(SELECT_POCKETMON_MESSAGE, ApplicationContext.getPlayer().getName()));
        return br.readLine();
    }

    public static boolean confirmPocketMon(Detail detail) throws IOException {
        println(String.format(POCKETMON_DETAIL, detail.getName(), detail.getType().getName(), detail.getColor(), detail.getHeight(), detail.getWeight()));
        return br.readLine().equals("1");
    }

    public static String inputPockeMonName() throws IOException {
        println(INPUT_POCKETMON_NAME);
        return br.readLine();
    }

    public static String selectMainMenu() throws IOException {
        println(SELECT_MAIN_MENU);
        return br.readLine();
    }

    public static String buyProduct() throws IOException {
        println(String.format(SELECT_PRODUCT, ApplicationContext.getPlayer().getPoint()));
        return br.readLine();
    }

    public static String selectGymMenu() throws IOException {
        println(SELECT_GYM_MENU);
        return br.readLine();
    }

    public static String inputAttackPoint(boolean isTurn) throws IOException {
        println(String.format(SELECT_ATTACK_POINT, isTurn ? "공격": "방어"));
        return br.readLine();
    }


    private static void println(String input){
        System.out.println(input);
    }

}
