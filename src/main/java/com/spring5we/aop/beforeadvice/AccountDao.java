package com.spring5we.aop.beforeadvice;

import org.springframework.stereotype.Component;

@Component
public class AccountDao {

    public void addAccount(){

        System.out.println("AccountDao >> Business DAO addAccount ");
    }

    public void addAccount(Account account){


        account.getPersonName();
        account.getAccountNumber();


        System.out.println("AccountDao >> Business DAO addAccount ");
    }

    public void addAccount(Account account, boolean privilizedAccont){

        System.out.println("AccountDao >> Business DAO addAccount ");
    }
}
