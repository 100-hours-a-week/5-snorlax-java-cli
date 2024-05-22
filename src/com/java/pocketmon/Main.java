package com.java.pocketmon;

import com.java.pocketmon.domain.gym.constant.AttackPoint;
import com.java.pocketmon.domain.gym.dto.response.FightDto;
import com.java.pocketmon.domain.gym.dto.response.FightResultDto;
import com.java.pocketmon.domain.gym.model.Gym;
import com.java.pocketmon.domain.laboratory.dto.response.ProductsDto;
import com.java.pocketmon.domain.laboratory.model.Laboratory;
import com.java.pocketmon.domain.laboratory.model.Order;
import com.java.pocketmon.domain.player.model.Player;
import com.java.pocketmon.domain.pocketmon.constant.Detail;
import com.java.pocketmon.domain.pocketmon.model.PocketMon;
import com.java.pocketmon.view.InputView;
import com.java.pocketmon.view.OutputView;
import java.io.IOException;


public class Main {

    private static Player player;
    private static Gym gym;
    private static Laboratory laboratory = new Laboratory();

    public static void main(String[] args) throws Exception {
        init();
        main();
    }

    private static void init() throws Exception{
        inputPlayer();
        selectPocketMon();
    }

    private static void main() throws Exception{
        while(true){
            int menu = Integer.parseInt(InputView.selectMainMenu());
            if(menu == 1){
                shopping();
            }else if(menu == 2){
                gymFight();
                if(player.getPocketMon().isMaxExp()){
                    changePocketMon();
                    break;
                }
            }else if(menu == 3){
                OutputView.printPocketMonDetail(player.getPocketMon().getInfo());
            }else {
                OutputView.printPlayerInfo(player.getInfo());
            }
        }

    }

    private static void changePocketMon() {
        player.setPocketMon(player.getPocketMon().evolve());
        OutputView.printEvolve(player.getPocketMon());
    }


    private static void gymFight() throws IOException {
        OutputView.printWelcomeGymMsg();
        int num = Integer.parseInt(InputView.selectGymMenu());
        if(num == 2){
            return;
        }
        gym = new Gym(player.getPocketMon());
        OutputView.printStartFightMsg(gym.getOppPocketMon().getName());
        while(true){
            num = Integer.parseInt(InputView.inputAttackPoint(gym.isMyTurn()));
            FightDto result = gym.fight(AttackPoint.getByNum(num));
            OutputView.printFightResult(result);
            if(gym.isEnd()){
                FightResultDto totalResult = gym.getResult();
                player.savePoint(totalResult.getPoint());
                player.getPocketMon().updateStatus(totalResult.getExp());
                OutputView.printEndFight(totalResult);
                break;
            }
        }
    }

    private static void shopping() throws IOException {
        while(true){
            int num = Integer.parseInt(InputView.buyProduct());
            if(num == 3){
                break;
            }
            String input = InputView.inputProductCnt();
            if(input.equals("exit")){
                continue;
            }
            ProductsDto product = laboratory.getProductInfo(num);
            OutputView.printCompleteBuy(player.buyProduct(new Order(product.getName(), product.getPrice(), Integer.parseInt(input))));
        }
    }


    private static void inputPlayer() throws Exception {
        player = new Player(InputView.inputUserName());
    }

    private static void selectPocketMon() throws IOException {
        while(true){
            int num = Integer.parseInt(InputView.selectPocketMon());
            if(InputView.confirmPocketMon(Detail.getByNum(num))){
                player.setPocketMon(PocketMon.valueOf(Detail.getByNum(num).getName()));
                break;
            }
        }
        String name = InputView.inputPockeMonName();
        player.getPocketMon().setName(name);
        OutputView.printCompleteAdoptMsg();
    }


}
