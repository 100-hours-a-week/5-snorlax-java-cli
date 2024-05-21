package com.java.pocketmon.domain.pocketmon.model.mobugi;

import com.java.pocketmon.domain.pocketmon.constant.Detail;
import com.java.pocketmon.domain.pocketmon.model.PocketMon;

public class Mobugi extends PocketMon {

    public Mobugi(String name) {
        super(name);
        setDetail(Detail.MOBUGI);
    }

}
