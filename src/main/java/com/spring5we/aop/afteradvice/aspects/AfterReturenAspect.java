package com.spring5we.aop.afteradvice.aspects;

import com.spring5we.aop.afteradvice.AccountAA;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class AfterReturenAspect {

    @AfterReturning(pointcut = "com.spring5we.aop.afteradvice.aspects.AADeclarativePointcut.findAccPC()", returning = "result")
    public void afterfindAccountsAdvice(JoinPoint joinPoint, List<AccountAA> result){

        System.out.println("Logging for >>>> public void findAcconts() -> public void afterfindAccountsAdvice(JoinPoint joinPoint, List<Account> result)");

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature" + methodSignature);

        System.out.println(" return Param Accounts->" + result);


        for (AccountAA accName: result ) {

            accName.setPersonName(accName.getPersonName().toUpperCase());
        }

        System.out.println(" return Param Accounts->" + result);

        }


}
