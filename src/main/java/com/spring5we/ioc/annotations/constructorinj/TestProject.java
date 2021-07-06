package com.spring5we.ioc.annotations.constructorinj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TestProject {

    private static ProjectDelivery projectDelivery;
    @Autowired
    TestProject(ProjectDelivery projectDelivery){
        this.projectDelivery = projectDelivery;
    }

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        projectDelivery.execute();

    }
}
