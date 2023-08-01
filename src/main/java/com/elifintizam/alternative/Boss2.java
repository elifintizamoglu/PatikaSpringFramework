package com.elifintizam.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Boss2 implements IBoss {

    @Override
    public String version(String data) {
        return "Boss 2: " + data;
    }
}
