package com.elifintizam.qualifier3;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifier3Cdi")
@ApplicationScoped
public class Employee {

    //@Inject
    //private IBoss iBoss;

    @Inject
    @QualifierMultiple2(MultipleChoice.FIRST)
    private IBoss iBoss;

    public  Employee(){
        //iBoss=new Boss();
    }

    public String getData(String data){
        return iBoss.version(data);
    }
}
