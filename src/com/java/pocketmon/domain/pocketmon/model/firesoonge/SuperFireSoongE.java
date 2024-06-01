package com.java.pocketmon.domain.pocketmon.model.firesoonge;

import com.java.pocketmon.domain.pocketmon.constant.Detail;
import com.java.pocketmon.domain.pocketmon.model.PocketMon;
import com.java.pocketmon.domain.pocketmon.model.SuperPocketMon;

public class SuperFireSoongE extends SuperPocketMon {

    public SuperFireSoongE(PocketMon pocketMon) {
        super(pocketMon.getName());
        setDetail(Detail.SUPER_FIRE_SOONGE);
    }

}
