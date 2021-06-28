package com.spring5we.ioc.xmlconf.setterInj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployerSetter {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployerSetter employerSetter = context.getBean("employerSetter", EmployerSetter.class);

        employerSetter.printEmployeeDetails();


    }

}
