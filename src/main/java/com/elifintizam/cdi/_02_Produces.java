package com.elifintizam.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named(value = "producetuto")
@ApplicationScoped
public class _02_Produces {

    @Produces // it produces
    public List<String> getList(){
        List<String> list = new ArrayList<>();
        list.add("Html5");
        list.add("Css3");
        list.add("React");
        list.add("Angular");

        return list;
    }

}
