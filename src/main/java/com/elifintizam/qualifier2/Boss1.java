package com.elifintizam.qualifier2;

import javax.enterprise.inject.Default;

@Default
public class Boss1 implements IBoss {

    @Override
    public String version(String data) {
        return "Default: " + data;
    }
}
