package com.spring5we.ioc.annotations.lifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class ProtoTyprLifeCycleAnnotation {

    void businessMethod() {
        System.out.println(" Business Method");
    }

    @PostConstruct
    void init() {
        System.out.println(" Initilization of My ProtoTyprLifeCycle");

    }

    //    It will never get call as Container wont track the prototypes

    @PreDestroy
    void cleanup() {

        System.out.println(" CleaningUp of My ProtoTyprLifeCycle ");

    }
}
