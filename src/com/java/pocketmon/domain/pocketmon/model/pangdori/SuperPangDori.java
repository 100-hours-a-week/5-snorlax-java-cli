package com.java.pocketmon.domain.pocketmon.model.pangdori;

import com.java.pocketmon.domain.pocketmon.constant.Detail;

public class SuperPangDori extends PangDori{

    public SuperPangDori(String name) {
        super(name);
        setDetail(Detail.SUPER_PANGDORI);
    }
}
