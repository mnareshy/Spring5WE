package com.spring5we.aop.beforeadvice;

import org.springframework.stereotype.Component;

@Component
public class Account {

    String personName;
    String accountNumber;

    public String getPersonName() {
        System.out.println("Account -> getPersonName()");
        return personName;
    }

    public void setPersonName(String personName) {

        System.out.println("Account -> setPersonName(String personName)");
        this.personName = personName;
    }

    public String getAccountNumber() {
        System.out.println("Account -> getAccountNumber()");
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        System.out.println("Account -> setAccountNumber(String accountNumber)");
        this.accountNumber = accountNumber;
    }
}
