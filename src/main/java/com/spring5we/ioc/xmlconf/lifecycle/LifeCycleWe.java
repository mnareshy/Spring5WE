package com.spring5we.ioc.xmlconf.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleWe {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        context.getBean("singleTonLifeCycle");
        context.getBean("protoTyprLifeCycle");

        context.getBean("prototypeCustomDestroy");

        context.close();

//         Notice Destroy is not invoked on Prototype Beans

    }
}
