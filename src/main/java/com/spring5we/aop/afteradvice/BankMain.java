package com.spring5we.aop.afteradvice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankMain {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.spring5we.aop.afteradvice.JavaConfigAOP.class);
        AccountAADao accountAADao =  context.getBean("accountAADao", AccountAADao.class);
        AccountAA accountAA =  context.getBean("accountAA", AccountAA.class);

        System.out.println("Accounts :>>>> "+ accountAADao.findAcconts());

        try {
            accountAADao.getAcoount(accountAA);
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        context.close();

    }
}
