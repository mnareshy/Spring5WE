package com.spring5we.ioc.annotations.methodinj;

import com.spring5we.ioc.annotations.setterinj.ProjectDeliverySetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TestProjectMethod {

    private static ProjectDeliveryMethod projectDeliveryMethod;


    @Autowired
    public  void setSomeDeliverySetter(ProjectDeliveryMethod projectDeliveryMethod) {
        TestProjectMethod.projectDeliveryMethod = projectDeliveryMethod;
    }

  

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        projectDeliveryMethod.execute();

    }
}
