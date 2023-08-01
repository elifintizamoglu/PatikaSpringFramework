package com.elifintizam.qualifier;

import javax.enterprise.inject.Alternative;

@QualifierMultiple
public class Boss2 implements IBoss {

    @Override
    public String version(String data) {
        return "Qualifier Multiple 1: " + data;
    }
}
