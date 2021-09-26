package com.spring5we.aop.afteradvice;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountAADao {


    List<AccountAA> accounts = new ArrayList<AccountAA>();

    public void addAccount(){

        System.out.println("AccountDao >> Business DAO addAccount ");
    }

    public void addAccount(AccountAA account){


        account.getPersonName();
        account.getAccountNumber();


        System.out.println("AccountDao >> Business DAO addAccount ");
    }


    public void addAccount(AccountAA account, boolean privilizedAccont){

        System.out.println("AccountDao >> Business DAO addAccount ");
    }

    public List<AccountAA> findAcconts(){

        accounts.add(new AccountAA("sairam","acc1214"));
        accounts.add(new AccountAA("chinna","acc1217"));
        accounts.add(new AccountAA("zoomlaka","00021212"));
        accounts.add(new AccountAA("hooca","23455478"));


       return accounts;

    }

    public void getAcoount(AccountAA account) throws Exception{

            throw new Exception("unabble to get the account "+ account);


    }
}
