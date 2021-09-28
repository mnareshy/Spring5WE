package com.spring5we.aop.aroundadvice;

import com.spring5we.aop.afteradvice.AccountAADao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankMain {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigAOP.class);
        AccountAroundAdvDao accountAroundAdvDao =  context.getBean("accountAroundAdvDao", AccountAroundAdvDao.class);
        AccountAroundAdv accountAroundAdv =  context.getBean("accountAroundAdv", AccountAroundAdv.class);

        System.out.println("Accounts in Main:>>>> "+ accountAroundAdvDao.findAcconts());

        try {
            accountAroundAdvDao.getAcoount(accountAroundAdv);
        } catch (Exception e) {

            System.out.println("--- "+e.getMessage());
        }


        accountAroundAdvDao.addAccount(accountAroundAdv,true);

        context.close();

    }
}
