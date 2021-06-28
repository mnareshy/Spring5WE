package com.spring5we.ioc.xmlconf.constructorInj;

public class Employee {

    private Employee(String name, String dept){

        this.empName = name;
        this.dept = dept;

    }

    private String empName;
    private String dept;

    public String getEmployeeDetails(){

        return empName+" DEPT "+dept;

    }
}
