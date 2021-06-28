package com.spring5we.ioc.xmlconf.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        SingleTonBean singleTonBean = classPathXmlApplicationContext.getBean("singletonbean",SingleTonBean.class);
        SingleTonBean singleTonBean2 = classPathXmlApplicationContext.getBean("singletonbean",SingleTonBean.class);

        System.out.println("SingleTonBeans -> " +singleTonBean +" : "+singleTonBean2);

        PrototypeBean prototypeBean = classPathXmlApplicationContext.getBean("prototypebean", PrototypeBean.class);
        PrototypeBean prototypeBean2 = classPathXmlApplicationContext.getBean("prototypebean", PrototypeBean.class);

        System.out.println("PrototypeBeans -> " +prototypeBean +" : "+prototypeBean2);
    }
}
