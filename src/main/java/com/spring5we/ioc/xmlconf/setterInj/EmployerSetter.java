package com.spring5we.ioc.xmlconf.setterInj;


public class EmployerSetter {

   private EmployeeSetter employeeSetter;

    public void setEmployeeSetter(EmployeeSetter employeeSetter) {
        this.employeeSetter = employeeSetter;
    }

    public void printEmployeeDetails(){

        System.out.println(employeeSetter.getEmployeeDetails());
    }

}
