package com.java.pocketmon.domain.pocketmon.model.pangdori;

import com.java.pocketmon.domain.pocketmon.constant.Detail;
import com.java.pocketmon.domain.pocketmon.model.PocketMon;

public class SuperPangDori extends PangDori{

    private int shy;

    public SuperPangDori(PocketMon pocketMon) {
        super(pocketMon.getName());
        setDetail(Detail.SUPER_PANGDORI);
    }

    public void superShy(){
        shy += 1;
    }
}
