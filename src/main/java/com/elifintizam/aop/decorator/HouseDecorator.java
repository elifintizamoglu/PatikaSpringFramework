package com.elifintizam.aop.decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
abstract public class HouseDecorator implements IEv{

    private @Inject @Delegate
    IEv iEv;

    @Override
    public String coloring(String data) {
        System.out.println("Decorator was here.");
        String dataInfo = iEv.coloring(data);
        if(dataInfo.equals("Colored.")){
            dataInfo = dataInfo.toUpperCase();
        }
        return dataInfo;
    }
}
