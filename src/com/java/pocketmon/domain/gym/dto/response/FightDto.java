package com.java.pocketmon.domain.gym.dto.response;

import com.java.pocketmon.domain.gym.constant.AttackPoint;
import com.java.pocketmon.domain.gym.model.Gym;

public class FightDto {
    private boolean isAttack;
    private boolean isSuccess;
    private AttackPoint myAttackPoint;
    private AttackPoint oppAttackPoint;
    private int myRemainPower;
    private int oppRemainPower;

    public FightDto(Gym gym, boolean isSuccess, AttackPoint myAttackPoint, AttackPoint oppAttackPoint){
        this.isAttack = !gym.isMyTurn();
        this.isSuccess = isSuccess;
        this.myAttackPoint = myAttackPoint;
        this.oppAttackPoint = oppAttackPoint;
        this.myRemainPower = gym.getMyPocketMon().getPower();
        this.oppRemainPower = gym.getOppPocketMon().getPower();
    }

    public boolean isAttack() {
        return isAttack;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public AttackPoint getMyAttackPoint() {
        return myAttackPoint;
    }

    public AttackPoint getOppAttackPoint() {
        return oppAttackPoint;
    }

    public int getMyRemainPower() {
        return myRemainPower;
    }

    public int getOppRemainPower() {
        return oppRemainPower;
    }
}
