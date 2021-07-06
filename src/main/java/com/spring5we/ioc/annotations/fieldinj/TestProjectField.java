package com.spring5we.ioc.annotations.fieldinj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TestProjectField {

    public static String empName;
    public static String empDept;

    @Value("Some Name")
    public String someName;

    @Value("${emp.name}")
    public String someOtherName;

    @Autowired
    public void loadOnelinkConfig(@Value("${emp.name}") String empName,
                                  @Value("${emp.dept}") String empDept) {
        System.out.println(someName);
        System.out.println(someOtherName);
        TestProjectField.empName = empName;
        TestProjectField.empDept = empDept;

    }

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ProjectDeliveryField projectDeliveryField = context.getBean("projectDeliveryField", ProjectDeliveryField.class);
        projectDeliveryField.execute();

        System.out.println("Empname from Properties "+empName+"  EmpDept from Properties "+empDept);


    }
}
