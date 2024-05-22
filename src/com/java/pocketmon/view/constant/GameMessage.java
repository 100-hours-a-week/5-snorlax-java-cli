package com.java.pocketmon.view.constant;

public class GameMessage {
    public static final String INPUT_PLAYER_NAME = "환경합니다 포켓몬 연구소입니다.\n"
        + "플레이어 이름을 등록해주세요.";
    public static final String SELECT_POCKETMON_MESSAGE = "환영합니다 %s 님,\n"
        + "분양 받을 포켓몬을 선택해주세요.\n"
        + "#$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$;::$$$$$$$$$#\n"
        + "#$$$$$$$$$~=$$$$$$$$$$$$$$;:$$$$$$$$$$$$*,-- ~:$$$$$$$#\n"
        + "#$$$$;~$$=:*$$$$$$$$$$$$$$..$$$$$$$$$$$$=!~   -!$$$$$$#\n"
        + "#$$$$$-~~=;$$$$$$$$$$$$$;., .=$$$$$$$$$~,, :$  :$$$$$$#\n"
        + "#$$$$$$$!!$$$$$$$$$$$$$=~  -;:;$$$$$$$$. ~ .$  :$$$$$$#\n"
        + "#$$$$$$$$:.,,=$$$$$$$$$$.- !--$$$$$$$$$:..    ,;$$;$$$#\n"
        + "#$$$$$$$$,,,,.$$$$$$$$$$..   ,$$$$$$$$$~.   .,:!,.;$$$#\n"
        + "#$$$$$$$$,.,,,~$$$$$$$$$$.:~$$$.,*$$$$$$;,,,,;;.,;=$$$#\n"
        + "#$$$$$$$ ,-,,,~$$$$$$$$$$$=-$:$ $$$$$$$;,,:::~~,*=!$$$#\n"
        + "#$$$$$$! .-,,,~$$$$$$$$:;!$.: ;$$$$$$$$*.:--~~,,;!$$$$#\n"
        + "#$$$$$$!-.  ~~-$$$$$$$,.$$$ .,;$$$$$$$$$$$~,, ,,,!$$$$#\n"
        + "#$$$$$$-,:----$$$$$$$$!$$$=.;-*$$$$$$$$$$;!,,-,,-$$$$$#\n"
        + "#$$$$$,  ~~~~;-$$$$$$$$$$$$-=!!$$$$$$$$$$-.,,,,-~$$$$$#\n"
        + "#$$$$$,~~:~:;--$$$$$$$$$$$$$-$$$$$$$$$$$$=-.***!:$$$$$#\n"
        + "#$$$$$,*$;:$$$$$$$$$$$$$$$$$ ,$$$$$$$$$$$$$-$$$$:=$$$$#\n"
        + "#$$$$$$$$$$$$$$$$$$$$$$$$$$$=$$$$$$$$$$$$$$$$$$$$$$$$$#\n"+
        "1 : 모부기 2 : 불꽃숭이 3: 팽도리\n"
        + "숫자를 입력하면 자세한 정보를 확인할 수 있습니다.";
    public static final String POCKETMON_DETAIL = "이름 : %s, 타입 : %s, 색 : %s, 키 : %f m, 몸무게 : %f kg 입니다.\n"+
        "1: 분양하기 2: 취소";
    public static final String INPUT_POCKETMON_NAME = "분양이 완료되었습니다. 축하합니다\n"
        + "포켓몬 이름을 지어주세요.";
    public static final String SELECT_MAIN_MENU = "1. 연구소 2. 체육관 3. 펫 정보보기 4. 내 정보보기\n";
    public static final String SELECT_PRODUCT = "안녕하세요 필요한 물건이 있으신가요?\n"
        + "구매할 물건을 선택해주세요.\n"
        + "보유자산 : %dp\n"
        + "1. 간식 100p 2. 포켓몬 볼 200p 3. 나가기";
    public static final String INPUT_PRODUCT_CNT = "수량을 입력해주세요. 취소할 경우 exit를 입력하세요";
    public static final String SELECT_GYM_MENU = "1. 대련하기 2. 나가기\n";
    public static final String SELECT_ATTACK_POINT = "%s 위치를 선택해주세요. (숫자 입력)\n"+
        "1. 머리 2. 몸통 3. 다리";


    ////////

    public static final String COMPLETE_ADOPT_POCKETMON = "[%s]는 [%s]의 포켓몬으로 등록되었습니다. 대련을 통해 성장시켜주세요.\n";
    public static final String COMPLETE_BUY = "결제가 완료되었습니다. 감사합니다.";
    public static final String NOT_COMPLETE_BUY = "보유 자산이 부족하여 구매할 수 없습니다.";

    public static final String WELCOME_GYM = "안녕하세요 랜덤 몬스터와 펫을 대련시킬 수 있는 체육관입니다.\n"
        + "공격과 방어의 순서로 진행되며 체력이 모두 소진되면 패배하게 됩니다. \n"
        + "대련 중에 체력회복제는 한 번만 사용할 수 있고, 타입에 따라 공격의 데미지가 다르게 적용됩니다. (물 > 불 > 풀 > 물)\n"
        + "승리할 경우 경험치 300exp와 300p를 얻게 되고, 패배할 경우 100exp만 얻게 됩니다.";

    public static final String START_FIGHT = "대련을 시작하겠습니다.\n"
        + "대련상대는 [%s] 입니다.";

    public static final String FIGHT_RESULT = "내 선택 : %s, 상대 선택 : %s\n" +
        "[%s]에 [%s]하였습니다. 내 남은 체력 : %d, 상대 남은 체력 : %d";

    public static final String FIGHT_TOTAL_RESULT = "대련이 종료 되었습니다. [%s] 하였습니다.\n"
        + "경험치 + %d exp, 포인트 %d p 획득!";

    public static final String EVOLVE_RESULT = "[%s]가 목표 경험치를 모두 획득하여 진화합니다.\n"+
        "%s \n"+ "진화에 성공하였습니다.\n"
        + "축하합니다. 게임 종료";





}
