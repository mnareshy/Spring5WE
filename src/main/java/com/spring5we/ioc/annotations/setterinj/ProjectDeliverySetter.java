package com.spring5we.ioc.annotations.setterinj;

import com.spring5we.ioc.annotations.constructorinj.Programmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ProjectDeliverySetter {

    Programmer javaProgrammer;

   public ProjectDeliverySetter(){
    }

    @Autowired
    public void setJavaProgrammer(@Qualifier("cProgrammer") Programmer javaProgrammer) {
        this.javaProgrammer = javaProgrammer;
    }

    public void execute(){

        javaProgrammer.program();
    }

}
