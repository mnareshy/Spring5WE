package com.spring5we.aop.aroundadvice.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundAdvADeclarativePointcut {

    @Pointcut("execution(* findAcconts(..))")
    public void findAccPC() {    }

    @Pointcut("execution(* addAccount(..))")
    public void addAccPC() {    }

    @Pointcut("execution(* getAcoount(..))")
    public void getAccPC() {    }


}
