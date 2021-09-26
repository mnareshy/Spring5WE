package com.spring5we.aop.beforeadvice.usingmethoddata;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BAUsgMethodData {



    @Before("com.spring5we.aop.beforeadvice.orderedaspects.pointcuts.Pointcuts.addAccPCNoSetterAndGetter()")
    public void  bAaddAccountNotSettrGetterUsingMethodData(JoinPoint joinPoint){

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        System.out.println(" bAaddAccountNotSettrGetterUsingMethodData >>>>  methodSignature ) " +methodSignature);

        Object args[] = joinPoint.getArgs();

        for(Object argss :args ){

            System.out.println("Method Arguments :: "+argss );

        }


    }


}
