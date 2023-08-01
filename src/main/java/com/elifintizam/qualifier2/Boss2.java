package com.elifintizam.qualifier2;

@QualifierMultiple
public class Boss2 implements IBoss {

    @Override
    public String version(String data) {
        return "Qualifier Multiple 1: " + data;
    }
}
