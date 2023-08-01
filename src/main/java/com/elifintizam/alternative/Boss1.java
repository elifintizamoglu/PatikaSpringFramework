package com.elifintizam.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Boss1 implements IBoss {

    @Override
    public String version(String data) {
        return "Boss 1: " + data;
    }
}
