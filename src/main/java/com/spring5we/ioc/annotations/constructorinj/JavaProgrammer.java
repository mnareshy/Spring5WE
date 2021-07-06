package com.spring5we.ioc.annotations.constructorinj;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("javaProgrammer")
public class JavaProgrammer implements Programmer{
    @Override
    public void program() {
        System.out.println("Java Progreammer Programming in Java");
    }
}
