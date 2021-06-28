package com.spring5we.ioc.xmlconf.constructorInj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployer {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employer employer = context.getBean("employer",Employer.class);

        employer.printEmployeeDetails();


    }

}
