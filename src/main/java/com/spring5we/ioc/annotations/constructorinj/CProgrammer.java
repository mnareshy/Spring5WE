package com.spring5we.ioc.annotations.constructorinj;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cProgrammer")
@Primary
public class CProgrammer implements Programmer {


    @Override
    public void program() {

        System.out.println("Programmer Programming in C");

    }
}
