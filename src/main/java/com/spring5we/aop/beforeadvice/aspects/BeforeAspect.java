package com.spring5we.aop.beforeadvice.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAspect {

    @Before("execution(public void addAccount())")
    public void beforeAddAccountAdvice(){

        System.out.println("Logging for >>>> public void addAccount() -> \"execution(public void addAccount())\"");

    }

    @Before("execution( * com.spring5we.aop.beforeadvice.*.*())")
    public void beforeAddAccountAdvicePkgscan(){

        System.out.println("Logging for >>>> public void beforeAddAccountAdvicePkgscan() -> \"execution( * com.spring5we.aop.beforeadvice.*.*())\"");

    }

    //for parameter the type has to be fully qualified
    //.. for 0 or many arguments
    //* for 1 parameter, for multiple use , separated
    @Before("execution(public void addAccount(com.spring5we.aop.beforeadvice.Account, ..))")
    public void beforeAddAccountAdviceParameter(){

        System.out.println("Logging for >>>> beforeAddAccountAdviceParameter() ->         System.out.println(\"Logging for >>>> beforeAddAccountAdviceParameter() -> \");\n");

    }

    @Before("execution( * add*(..))")
    public void beforeAddAccountAdvicewildCard(){

        System.out.println("Logging for >>>> public void addAccount() beforeAddAccountAdvicewildCard -> \"execution(public * add*(*))\"");

    }
}
