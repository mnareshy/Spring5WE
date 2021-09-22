package com.spring5we.aop.beforeadvice;

import com.spring5we.aop.JavaConfigAOP;
import com.spring5we.ioc.javaconfigs.config.JavaConfig;
import org.aesh.readline.terminal.Key;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankMain {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigAOP.class);
        AccountDao accountDao =  context.getBean("accountDao", AccountDao.class);
        Account account =  context.getBean("account", Account.class);

        account.setPersonName("chandu");
        account.setAccountNumber("acc121212");

        accountDao.addAccount();
        accountDao.addAccount(account,true);

        context.close();

    }
}
