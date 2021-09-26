package com.spring5we.aop.afteradvice.aspects;

import com.spring5we.aop.afteradvice.AccountAA;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class AfterThrowFinallyAspect {

    @AfterThrowing(pointcut = "com.spring5we.aop.afteradvice.aspects.AAThrowFinallyPointcut.getAccPC()", throwing = "exception")
    public void aftergetAccThrowingAdvice(JoinPoint joinPoint, Throwable exception){

        System.out.println("Logging for >>>> public void aftergetAccThrowingAdvice() -> "+ joinPoint);

        System.out.println(" Exception on getAccounts -> **" + exception);

        }


    @After("com.spring5we.aop.afteradvice.aspects.AAThrowFinallyPointcut.getAccPC()")
    public void aftergetAccFinallyAdvice(JoinPoint joinPoint){

        System.out.println("Logging for >>>> public void aftergetAccFinallyAdvice() -> "+ joinPoint);

    }

}
