package com.spring5we.ioc.xmlconf.setterInj;

public class EmployeeSetter {



    private String empName;
    private String dept;

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getEmployeeDetails(){

        return empName+" DEPT "+dept;

    }
}