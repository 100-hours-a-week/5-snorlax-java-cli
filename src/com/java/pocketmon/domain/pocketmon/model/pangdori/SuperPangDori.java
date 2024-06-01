package com.java.pocketmon.domain.pocketmon.model.pangdori;

import com.java.pocketmon.domain.pocketmon.constant.Detail;
import com.java.pocketmon.domain.pocketmon.model.PocketMon;
import com.java.pocketmon.domain.pocketmon.model.SuperPocketMon;

public class SuperPangDori extends SuperPocketMon {

    public SuperPangDori(PocketMon pocketMon) {
        super(pocketMon.getName());
        setDetail(Detail.SUPER_PANGDORI);
    }

}
