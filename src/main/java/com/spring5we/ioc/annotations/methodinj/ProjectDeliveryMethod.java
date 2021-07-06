package com.spring5we.ioc.annotations.methodinj;

import com.spring5we.ioc.annotations.constructorinj.Programmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ProjectDeliveryMethod {

    Programmer javaProgrammer;

   public ProjectDeliveryMethod(){
    }

    @Autowired
    public void setSomeProgrammer( Programmer javaProgrammer) {
        this.javaProgrammer = javaProgrammer;
    }

    public void execute(){

        javaProgrammer.program();
    }

}
