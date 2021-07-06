package com.spring5we.ioc.annotations.fieldinj;

import com.spring5we.ioc.annotations.constructorinj.Programmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ProjectDeliveryField {

    @Autowired
    @Qualifier("javaProgrammer")
    Programmer javaProgrammer;

   public ProjectDeliveryField(){
    }


    public void execute(){

        javaProgrammer.program();
    }

}
