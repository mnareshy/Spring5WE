package com.spring5we.ioc.xmlconf.lifecycle;

public class ProtoTyprLifeCycle {

    void businessMethod() {
        System.out.println(" Business Method");
    }

    void init() {
        System.out.println(" Initilization of My ProtoTyprLifeCycle");

    }

    //    It will never get call as Container wont track the prototypes
    void cleanup() {
        System.out.println(" CleaningUp of My ProtoTyprLifeCycle ");

    }
}
