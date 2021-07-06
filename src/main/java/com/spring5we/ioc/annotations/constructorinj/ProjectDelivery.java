package com.spring5we.ioc.annotations.constructorinj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ProjectDelivery {

    Programmer javaProgrammer;

   @Autowired
   public ProjectDelivery(@Qualifier("javaProgrammer") Programmer javaProgrammer){
        this.javaProgrammer = javaProgrammer;
    }

    public void execute(){

        javaProgrammer.program();
    }

}
