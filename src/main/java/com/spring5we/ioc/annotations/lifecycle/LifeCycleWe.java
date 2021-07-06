package com.spring5we.ioc.annotations.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleWe {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        SingleTonLifeCycleAnnotation singleTonLifeCycleAnnotation =  context.getBean("singleTonLifeCycleAnnotation",SingleTonLifeCycleAnnotation.class);
        context.getBean("protoTyprLifeCycleAnnotation");


        context.getBean("prototypeCustomDestroyAnnotation");

        context.close();

//         Notice Destroy is not invoked on Prototype Beans

    }
}
