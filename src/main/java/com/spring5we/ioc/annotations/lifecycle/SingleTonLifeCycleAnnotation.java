package com.spring5we.ioc.annotations.lifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SingleTonLifeCycleAnnotation {

    void businessMethod(){
        System.out.println(" Business Method");
    }

    @PostConstruct
    void init(){
        System.out.println(" Initilization of My SingletonAnnotation");

    }


    @PreDestroy
    void cleanup(){
        System.out.println(" CleaningUp of My SingletonAnnotation");

    }
}
