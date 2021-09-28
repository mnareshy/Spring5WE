package com.spring5we.aop.aroundadvice;

import com.spring5we.aop.afteradvice.AccountAA;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountAroundAdvDao {


    List<AccountAroundAdv> accounts = new ArrayList<AccountAroundAdv>();

    public void addAccount(){

        System.out.println("AccountAroundAdvDao >> Business DAO addAccount ");
    }

    public void addAccount(AccountAroundAdv account){


        account.getPersonName();
        account.getAccountNumber();


        System.out.println("AccountAroundAdvDao >> Business DAO addAccount ");
    }


    public void addAccount(AccountAroundAdv account, boolean privilizedAccont){

        System.out.println("AccountAroundAdvDao >> Business DAO addAccount ");
    }

    public List<AccountAroundAdv> findAcconts(){

        accounts.add(new AccountAroundAdv("sairam","acc1214"));
        accounts.add(new AccountAroundAdv("chinna","acc1217"));
        accounts.add(new AccountAroundAdv("zoomlaka","00021212"));
        accounts.add(new AccountAroundAdv("hooca","23455478"));


       return accounts;

    }

    public void getAcoount(AccountAroundAdv account) throws Exception{

            throw new Exception("unabble to get the account "+ account);


    }
}
