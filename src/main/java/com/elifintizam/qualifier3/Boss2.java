package com.elifintizam.qualifier3;

@QualifierMultiple2(MultipleChoice.FIRST)
public class Boss2 implements IBoss {

    @Override
    public String version(String data) {
        return "Qualifier Multiple Enum 1: " + data;
    }
}
