package com.java.pocketmon.domain.pocketmon.model.pangdori;

import com.java.pocketmon.domain.pocketmon.constant.Detail;
import com.java.pocketmon.domain.pocketmon.model.PocketMon;

public class PangDori extends PocketMon {

    public PangDori(String name) {
        super(name);
        setDetail(Detail.PANGDORI);
    }
}
