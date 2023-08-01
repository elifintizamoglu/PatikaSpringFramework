package com.elifintizam.qualifier3;

@QualifierMultiple2(MultipleChoice.SECOND)
public class Boss3 implements IBoss {

    @Override
    public String version(String data) {
        return "Qualifier Multiple Enum 2: " + data;
    }
}
