package com.spring5we.ioc.javaconfigs.fieldinj;

import com.spring5we.ioc.javaconfigs.config.JavaConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestProjectField {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        ProjectDeliveryFieldJavaConf projectDeliveryField = context.getBean("projectDeliveryFieldJavaConf", ProjectDeliveryFieldJavaConf.class);
        projectDeliveryField.execute();

        ProjectDeliveryFieldJavaConf projectDeliveryField1 = context.getBean("projectDeliveryFieldJavaConf", ProjectDeliveryFieldJavaConf.class);

//        System.out.println(projectDeliveryField1 +" "+projectDeliveryField);

        ProgrammerJavaConf programmerJavaConf = context.getBean("programmerJavaConf", JavaProgrammerJavaConf.class);

        ProgrammerJavaConf programmerJavaConf1 = context.getBean("programmerJavaConf", JavaProgrammerJavaConf.class);

//        System.out.println(programmerJavaConf +" : "+ programmerJavaConf1);


        System.out.println("Empname from Properties "+projectDeliveryField1.getEmpName()+"  EmpDept from Properties "+projectDeliveryField1.getEmpDept());


    }
}
