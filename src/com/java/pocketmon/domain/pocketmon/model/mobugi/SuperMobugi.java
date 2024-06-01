package com.java.pocketmon.domain.pocketmon.model.mobugi;

import com.java.pocketmon.domain.pocketmon.constant.Detail;
import com.java.pocketmon.domain.pocketmon.model.PocketMon;
import com.java.pocketmon.domain.pocketmon.model.SuperPocketMon;

public class SuperMobugi extends SuperPocketMon {

    public SuperMobugi(PocketMon pocketMon) {
        super(pocketMon.getName());
        setDetail(Detail.SUPER_MOBUGI);
    }

}
