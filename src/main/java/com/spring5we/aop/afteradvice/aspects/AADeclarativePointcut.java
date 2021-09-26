package com.spring5we.aop.afteradvice.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AADeclarativePointcut {

    @Pointcut("execution(* findAcconts(..))")
    public void findAccPC() {    }



}
