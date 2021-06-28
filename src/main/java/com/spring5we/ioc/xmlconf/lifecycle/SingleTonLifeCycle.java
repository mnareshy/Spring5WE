package com.spring5we.ioc.xmlconf.lifecycle;

public class SingleTonLifeCycle {

    void businessMethod(){
        System.out.println(" Business Method");
    }

    void init(){
        System.out.println(" Initilization of My Singleton");

    }

    void cleanup(){
        System.out.println(" CleaningUp of My Singleton");

    }
}
