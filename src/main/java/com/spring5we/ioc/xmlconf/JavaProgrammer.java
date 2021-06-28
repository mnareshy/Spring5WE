package com.spring5we.ioc.xmlconf;

public class JavaProgrammer implements Programmer{
    @Override
    public void program(String programmingLanguage) {

        System.out.println("Java Program Development " + programmingLanguage);

    }
}
