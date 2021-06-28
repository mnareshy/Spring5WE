package com.spring5we.ioc.xmlconf;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProgrammer {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Programmer programmer = classPathXmlApplicationContext.getBean("javaprogrammer",Programmer.class);
        programmer.program("Java");

        programmer = classPathXmlApplicationContext.getBean("cprogrammer",Programmer.class);
        programmer.program("C");

    }
}
