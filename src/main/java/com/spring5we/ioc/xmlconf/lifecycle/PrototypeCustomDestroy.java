package com.spring5we.ioc.xmlconf.lifecycle;

import org.springframework.beans.factory.DisposableBean;

public class PrototypeCustomDestroy implements DisposableBean {


    void businessMethod() {

        System.out.println(" Business Method");
    }

    @Override
    public void destroy() throws Exception {

        System.out.println("Cleaning the Prototype Bean");

    }
}
