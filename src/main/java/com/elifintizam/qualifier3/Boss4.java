package com.elifintizam.qualifier3;

@QualifierMultiple2(MultipleChoice.THIRD)
public class Boss4 implements IBoss {

    @Override
    public String version(String data) {
        return "Qualifier Multiple Enum 3: " + data;
    }
}
