package com.java.pocketmon.domain.gym.dto;

import com.java.pocketmon.domain.gym.model.AttackPoint;
import com.java.pocketmon.domain.gym.model.Gym;

public class ResponseFightDto {
    private boolean isAttack;
    private boolean isSuccess;
    private AttackPoint myAttackPoint;
    private AttackPoint oppAttackPoint;
    private int myRemainPower;
    private int oppRemainPower;

    public ResponseFightDto(Gym gym, boolean isSuccess, AttackPoint myAttackPoint, AttackPoint oppAttackPoint){
        this.isAttack = gym.isMyTurn();
        this.isSuccess = isSuccess;
        this.myAttackPoint = myAttackPoint;
        this.oppAttackPoint = oppAttackPoint;
        this.myRemainPower = gym.getMyPocketMon().getPower();
        this.oppRemainPower = gym.getOppPocketMon().getPower();
    }



}
