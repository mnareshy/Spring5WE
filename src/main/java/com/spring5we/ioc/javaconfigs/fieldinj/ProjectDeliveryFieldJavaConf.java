package com.spring5we.ioc.javaconfigs.fieldinj;


import org.springframework.beans.factory.annotation.Value;

public class ProjectDeliveryFieldJavaConf {


    ProgrammerJavaConf javaProgrammerJavaConf;

    @Value("${emp.name}")
    public  String empName;
    @Value("${emp.dept}")
    public  String empDept;


    public ProjectDeliveryFieldJavaConf(  ProgrammerJavaConf javaProgrammerJavaConf){
        this.javaProgrammerJavaConf = javaProgrammerJavaConf;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void execute(){

        javaProgrammerJavaConf.program();
    }

}
