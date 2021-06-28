package com.spring5we.ioc.xmlconf.constructorInj;

public class Employer {

   private Employee employee;

    public Employer(Employee employee) {
        this.employee = employee;
    }

    public void printEmployeeDetails(){

        System.out.println(employee.getEmployeeDetails());
    }

}
