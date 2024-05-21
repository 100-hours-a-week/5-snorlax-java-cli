package com.java.pocketmon.domain.gym.model;

import com.java.pocketmon.domain.gym.constant.FightResult;
import com.java.pocketmon.domain.gym.dto.FightResultDto;
import com.java.pocketmon.domain.gym.dto.ResponseFightDto;
import com.java.pocketmon.domain.pocketmon.model.firesoongi.FireSoongE;
import com.java.pocketmon.domain.pocketmon.model.mobugi.Mobugi;
import com.java.pocketmon.domain.pocketmon.model.pangdori.PangDori;
import com.java.pocketmon.domain.pocketmon.model.PocketMon;
import java.util.List;
import java.util.Random;

public class Gym {
    static final List<PocketMon> pocketMons = List.of(new Mobugi("모부기"), new FireSoongE("불꽃숭이"), new PangDori("팽도리"));
    static final Random random = new Random();
    private PocketMon myPocketMon;
    private PocketMon oppPocketMon;
    private int myAttack;
    private int oppAttack;
    private boolean isMyTurn;

    public Gym(PocketMon myPocketMon){
        this.myPocketMon = myPocketMon;
        this.oppPocketMon = randomPocketMon();
        setDamage();
    }

    public ResponseFightDto fight(AttackPoint attackPoint){
        AttackPoint oppAttackPoint = randomAttackPoint();
        boolean isSuccess = (isMyTurn && attackPoint != oppAttackPoint) || (!isMyTurn && attackPoint == oppAttackPoint);

        if(attackPoint != oppAttackPoint){
            if(isMyTurn){
                oppPocketMon.getDamage(myAttack);
            }else {
                myPocketMon.getDamage(oppAttack);
            }
        }
        return new ResponseFightDto(this, isSuccess, attackPoint, oppAttackPoint);
    }

    public boolean isEnd(){
        return myPocketMon.getPower() == 0 || oppPocketMon.getPower() == 0;
    }

    public FightResultDto getResult(){
        if(myPocketMon.getPower() == 0){
            return new FightResultDto(true, FightResult.WINNER.getPoint(), FightResult.WINNER.getExp());
        }
        return new FightResultDto(false, FightResult.LOSER.getPoint(), FightResult.LOSER.getExp());
    }

    private PocketMon randomPocketMon(){

        return pocketMons.get(random.nextInt(pocketMons.size()));
    }

    private void setDamage(){
        if(myPocketMon.isAdventageous(oppPocketMon)){
            myAttack = 350;
            oppAttack = 200;
        }else {
            myAttack = 200;
            oppAttack = 350;
        }
    }

    private AttackPoint randomAttackPoint(){
        AttackPoint[] attackPoints = AttackPoint.values();
        return attackPoints[random.nextInt(attackPoints.length)];
    }

    public PocketMon getMyPocketMon() {
        return myPocketMon;
    }

    public PocketMon getOppPocketMon() {
        return oppPocketMon;
    }

    public boolean isMyTurn() {
        return isMyTurn;
    }
}
