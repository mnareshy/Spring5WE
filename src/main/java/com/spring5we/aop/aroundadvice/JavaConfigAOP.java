package com.spring5we.aop.aroundadvice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.spring5we.aop.aroundadvice")
public class JavaConfigAOP {
}
