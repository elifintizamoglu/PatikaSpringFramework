package com.elifintizam.cdi;

import com.elifintizam.StudentDTO;
import lombok.Getter;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "newtuto")
@ApplicationScoped
public class _04_New {

    @Produces
    public String producedData(@New StudentDTO studentDTO){
        studentDTO = studentDTO.builder().studentId(0L).studentName("Elif").build();

        return studentDTO.getStudentName();
    }

    @Getter
    @Inject
    private String consumedData;


}
