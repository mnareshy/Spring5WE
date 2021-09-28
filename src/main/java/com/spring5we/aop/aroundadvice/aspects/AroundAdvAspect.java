package com.spring5we.aop.aroundadvice.aspects;

import com.spring5we.aop.afteradvice.AccountAA;
import com.spring5we.aop.aroundadvice.AccountAroundAdv;
import com.spring5we.aop.aroundadvice.AccountAroundAdvDao;
import com.spring5we.aop.aroundadvice.JavaConfigAOP;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class AroundAdvAspect {

    @Around("com.spring5we.aop.aroundadvice.aspects.AroundAdvADeclarativePointcut.findAccPC()")
    public Object aroundFindAccountsAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("Logging for >>>> public void findAcconts() -> aroundFindAccountsAdvice(ProceedingJoinPoint proceedingJoinPoint) ");

        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        System.out.println("methodSignature" + methodSignature);

        Object result = proceedingJoinPoint.proceed();

        System.out.println(" return Param Accounts->" + result);

        return result;
    }

    @Around("com.spring5we.aop.aroundadvice.aspects.AroundAdvADeclarativePointcut.addAccPC()")
    public Object aroundFindAddAccountAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("Logging for >>>> public void addAccPC() -> aroundFindAccountsAdvice(ProceedingJoinPoint proceedingJoinPoint) ");

        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        System.out.println("methodSignature" + methodSignature);

        Object args[] = {null,true};
        Object result = proceedingJoinPoint.proceed(args);

        System.out.println(" return Param addAccPC->" + result);

        return result;
    }

  /*  @Around("com.spring5we.aop.aroundadvice.aspects.AroundAdvADeclarativePointcut.getAccPC()")
    public Object aroundgetAccThrowingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("Logging for >>>> public void aroundgetAccThrowingAdvice() -> "+ proceedingJoinPoint);

        Object result =null;
       try{

           result = proceedingJoinPoint.proceed();

       }
       catch (Exception exception){

           System.out.println(" Exception on getAccounts -> **" + exception);

       }


        return result;

        }*/

    @Around("com.spring5we.aop.aroundadvice.aspects.AroundAdvADeclarativePointcut.getAccPC()")
    public Object aroundgetAccReThrowAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("Logging for >>>> public void aroundgetAccReThrowAdvice() -> "+ proceedingJoinPoint);

        Object result = null;

        try{

            result = proceedingJoinPoint.proceed();

        }
        catch (Exception exception){

            System.out.println(" Exception on getAccounts -> **" + exception);
            throw new Exception("*****Exception Rethrown **** "+exception.getMessage());

        }


        return result;


    }

}
