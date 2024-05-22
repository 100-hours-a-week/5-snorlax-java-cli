package com.java.pocketmon.view;

import static com.java.pocketmon.view.constant.GameMessage.COMPLETE_ADOPT_POCKETMON;
import static com.java.pocketmon.view.constant.GameMessage.EVOLVE_RESULT;
import static com.java.pocketmon.view.constant.GameMessage.FIGHT_RESULT;
import static com.java.pocketmon.view.constant.GameMessage.FIGHT_TOTAL_RESULT;
import static com.java.pocketmon.view.constant.GameMessage.START_FIGHT;
import static com.java.pocketmon.view.constant.GameMessage.WELCOME_GYM;

import com.java.pocketmon.domain.gym.dto.response.FightDto;
import com.java.pocketmon.domain.gym.dto.response.FightResultDto;
import com.java.pocketmon.domain.pocketmon.constant.PocketMonInfo;
import com.java.pocketmon.domain.pocketmon.model.PocketMon;
import com.java.pocketmon.util.ApplicationContext;

public class OutputView {

    public static void printCompleteAdoptMsg(boolean isTurn) {
        println(String.format(COMPLETE_ADOPT_POCKETMON, ApplicationContext.getPocketMonName(), ApplicationContext.getPlayer().getName()));
    }

    public static void printWelcomeGymMsg(){
        println(WELCOME_GYM);
    }

    public static void printStartFightMsg(String oppName){
        println(String.format(START_FIGHT, oppName));
    }

    public static void printFightResult(FightDto fightDto){
        println(String.format(FIGHT_RESULT, fightDto.getMyAttackPoint(), fightDto.getOppAttackPoint(),
            fightDto.isAttack()? "공격":"방어", fightDto.isSuccess(), fightDto.getMyRemainPower(), fightDto.getOppRemainPower()));
    }

    public static void printEndFight(FightResultDto fightResultDto){
        println(String.format(FIGHT_TOTAL_RESULT, fightResultDto.isWinner()? "승리":"패배", fightResultDto.getExp(), fightResultDto.getPoint()));
    }

    public static void printEvolve(PocketMon pocketMon){
        println(String.format(EVOLVE_RESULT, pocketMon.getName(), PocketMonInfo.getByName(pocketMon.getDetail().getName()).getShapeCode()));
    }

    private static void println(String input){
        System.out.println(input);
    }
}
