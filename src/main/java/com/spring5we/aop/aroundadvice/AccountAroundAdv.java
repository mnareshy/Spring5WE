package com.spring5we.aop.aroundadvice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AccountAroundAdv {


    String personName;
    String accountNumber;



    @Autowired
    public AccountAroundAdv(@Value("naresh")String personName, @Value("acc12122")String accountNumber) {
        this.personName = personName;
        this.accountNumber = accountNumber;
    }


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

    @Override
    public String toString() {
        return "Account{" +
                "personName='" + personName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }


}
