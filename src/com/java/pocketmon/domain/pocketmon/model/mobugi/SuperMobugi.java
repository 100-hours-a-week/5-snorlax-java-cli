package com.java.pocketmon.domain.pocketmon.model.mobugi;

import com.java.pocketmon.domain.pocketmon.constant.Detail;
import com.java.pocketmon.domain.pocketmon.model.mobugi.Mobugi;

public class SuperMobugi extends Mobugi {

    public SuperMobugi(String name) {
        super(name);
        setDetail(Detail.SUPER_MOBUGI);
    }
}
