package com.elifintizam.ioc_di;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "iocEmployee")
@ApplicationScoped
public class Employee {

    @Inject
    private IBoss iBoss;

    public  Employee(){
        //iBoss=new Boss();
    }

    public String getData(String data){
        return iBoss.version(data);
    }
}
