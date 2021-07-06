package com.spring5we.ioc.javaconfigs.config;

import com.spring5we.ioc.javaconfigs.fieldinj.JavaProgrammerJavaConf;
import com.spring5we.ioc.javaconfigs.fieldinj.ProgrammerJavaConf;
import com.spring5we.ioc.javaconfigs.fieldinj.ProjectDeliveryFieldJavaConf;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:employee.properties")
//ComponentScan use when using Annotations to avoid XML configurations
//@ComponentScan("com.spring5we.ioc.javaconfigs")
public class JavaConfig {

    @Bean
    @Scope("prototype")
    public ProgrammerJavaConf programmerJavaConf(){
        ProgrammerJavaConf programmerJavaConf = new JavaProgrammerJavaConf();
        System.out.println(programmerJavaConf);
        return programmerJavaConf;

    }

    @Bean
    public ProjectDeliveryFieldJavaConf projectDeliveryFieldJavaConf(){
        ProjectDeliveryFieldJavaConf projectDeliveryFieldJavaConf = new ProjectDeliveryFieldJavaConf(programmerJavaConf());
        System.out.println(projectDeliveryFieldJavaConf);
        return projectDeliveryFieldJavaConf;
    }

}
