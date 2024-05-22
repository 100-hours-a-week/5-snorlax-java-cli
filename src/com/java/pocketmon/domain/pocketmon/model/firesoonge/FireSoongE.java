package com.java.pocketmon.domain.pocketmon.model.firesoonge;

import com.java.pocketmon.domain.pocketmon.constant.Detail;
import com.java.pocketmon.domain.pocketmon.model.PocketMon;

public class FireSoongE extends PocketMon {

    public FireSoongE(String name) {
        super(name);
        setDetail(Detail.FIRE_SOONGE);
    }

    @Override
    public PocketMon evolve() {
        return new SuperFireSoongE(this);
    }
}
