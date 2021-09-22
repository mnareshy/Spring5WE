package com.spring5we.ioc.xmlconf.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AwareCallBacks implements BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

        System.out.println("BeanFactoryAware : " +beanFactory.toString());


    }

    @Override
    public void setBeanName(String beanName) {

        System.out.println("BeanNameAware : " + beanName);

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        System.out.println("ApplicationContext : "+ applicationContext);


    }
}
