package com.spring5we.aop.beforeadvice.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BADeclarativePointcut {

    @Pointcut("execution(public void addAccount(..))")
    public void addAccPC() {    }

    @Pointcut("execution( * set*(..))")
    public void setterPC() {    }

    @Pointcut("execution( * get())")
    public void getterPC() {    }




    @Before("addAccPC()")
    public void  bAaddAccount(){

        System.out.println("BADeclarativePointcut >>>>  @Before(\"addAccPC()\") >>  @Pointcut(\"execution(public void addAccount(..))\") ");
    }

    @Before("setterPC()")
    public void  bAsetter(){

        System.out.println("BADeclarativePointcut >>>>  @Before(\"bAsetter()\") >>  @Pointcut(\"execution( * set*(..))\") ");
    }

    @Before("getterPC()")
    public void  bAgetter(){

        System.out.println("BADeclarativePointcut >>>>  @Before(\"bAgetter()\") >>  @Pointcut(\"execution( * get())\") ");
    }


    @Before("addAccPC() && !(setterPC() ||getterPC() )")
    public void  bAaddAccountNotSettrGetter(){

        System.out.println("BADeclarativePointcut >>>>   @Before(\"addAccPC() && !(setterPC() ||getterPC() )\") ");
    }


}
