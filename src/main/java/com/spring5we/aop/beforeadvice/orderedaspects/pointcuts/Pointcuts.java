package com.spring5we.aop.beforeadvice.orderedaspects.pointcuts;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Pointcuts {

    @Pointcut("execution(public void addAccount(..))")
    public void addAccPC() {    }

    @Pointcut("execution( * set*(..))")
    public void setterPC() {    }

    @Pointcut("execution( * get())")
    public void getterPC() {    }

    @Pointcut("addAccPC() && !(setterPC() || getterPC())")
    public void addAccPCNoSetterAndGetter() {    }




}
