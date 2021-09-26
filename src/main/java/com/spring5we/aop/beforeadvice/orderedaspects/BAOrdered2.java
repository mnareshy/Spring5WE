package com.spring5we.aop.beforeadvice.orderedaspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class BAOrdered2 {



    @Before("com.spring5we.aop.beforeadvice.orderedaspects.pointcuts.Pointcuts.addAccPCNoSetterAndGetter()")
    public void  bAaddAccountNotSettrGetterOrdered2(){

        System.out.println(" bAaddAccountNotSettrGetterOrdered >>>>  @Order(2) ");
    }


}
