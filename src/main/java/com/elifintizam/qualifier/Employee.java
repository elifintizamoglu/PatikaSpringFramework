package com.elifintizam.qualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifierCdi")
@ApplicationScoped
public class Employee {

    @Inject
    @QualifierMultiple
    private IBoss iBoss;

    public  Employee(){
        //iBoss=new Boss();
    }

    public String getData(String data){
        return iBoss.version(data);
    }
}
