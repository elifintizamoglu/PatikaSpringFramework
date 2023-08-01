package com.elifintizam.ioc_di;

public class Boss implements IBoss {

    @Override
    public String version(String data) {
        return "Version: " + data;
    }
}
