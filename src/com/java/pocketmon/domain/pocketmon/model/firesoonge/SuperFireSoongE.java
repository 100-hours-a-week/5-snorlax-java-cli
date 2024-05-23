package com.java.pocketmon.domain.pocketmon.model.firesoonge;

import com.java.pocketmon.domain.pocketmon.constant.Detail;
import com.java.pocketmon.domain.pocketmon.model.PocketMon;

public class SuperFireSoongE extends FireSoongE{

    private int shy;

    public SuperFireSoongE(PocketMon pocketMon) {
        super(pocketMon.getName());
        setDetail(Detail.SUPER_FIRE_SOONGE);
    }

    public void superShy(){
        shy += 1;
    }
}
