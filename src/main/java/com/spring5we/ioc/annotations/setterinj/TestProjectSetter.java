package com.spring5we.ioc.annotations.setterinj;

import com.spring5we.ioc.annotations.constructorinj.ProjectDelivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TestProjectSetter {

    private static ProjectDeliverySetter projectDeliverySetter;


    @Autowired
    public  void setProjectDeliverySetter(ProjectDeliverySetter projectDeliverySetter) {
        this.projectDeliverySetter = projectDeliverySetter;
    }

  

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        projectDeliverySetter.execute();

    }
}
