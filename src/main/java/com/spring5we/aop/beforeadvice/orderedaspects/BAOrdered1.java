package com.spring5we.aop.beforeadvice.orderedaspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class BAOrdered1 {



    @Before("com.spring5we.aop.beforeadvice.orderedaspects.pointcuts.Pointcuts.addAccPCNoSetterAndGetter()")
    public void  bAaddAccountNotSettrGetterOrdered(){

        System.out.println(" bAaddAccountNotSettrGetterOrdered >>>>  @Order(1) ");
    }


}
