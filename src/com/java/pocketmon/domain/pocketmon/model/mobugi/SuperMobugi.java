package com.java.pocketmon.domain.pocketmon.model.mobugi;

import com.java.pocketmon.domain.pocketmon.constant.Detail;
import com.java.pocketmon.domain.pocketmon.model.PocketMon;

public class SuperMobugi extends Mobugi {

    public SuperMobugi(PocketMon pocketMon) {
        super(pocketMon.getName());
        setDetail(Detail.SUPER_MOBUGI);
    }

}
