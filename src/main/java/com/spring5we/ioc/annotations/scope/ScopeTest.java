package com.spring5we.ioc.annotations.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        SingleTonBeanAnnotation singleTonBean = classPathXmlApplicationContext.getBean("singleTonBeanAnnotation", SingleTonBeanAnnotation.class);
        SingleTonBeanAnnotation singleTonBean2 = classPathXmlApplicationContext.getBean("singleTonBeanAnnotation", SingleTonBeanAnnotation.class);

        System.out.println("SingleTonBeans -> " + singleTonBean + " : " + singleTonBean2);

        PrototypeBeanAnnotation prototypeBean = classPathXmlApplicationContext.getBean("prototypeBeanAnnotation", PrototypeBeanAnnotation.class);
        PrototypeBeanAnnotation prototypeBean2 = classPathXmlApplicationContext.getBean("prototypeBeanAnnotation", PrototypeBeanAnnotation.class);

        System.out.println("PrototypeBeans -> " + prototypeBean + " : " + prototypeBean2);
    }
}
