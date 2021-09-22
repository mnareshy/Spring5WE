package com.spring5we.ioc.xmlconf.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessors implements BeanPostProcessor {


//    Spring calls this method after calling the methods of the aware
//    interfaces and before any bean initialization callbacks, such as
//    InitializingBean’s afterPropertiesSet or a custom init-method.

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)throws BeansException {

        System.out.println("postProcessBeforeInitialization  : "+ beanName);

        return bean;
    }
//    Spring calls this method after any bean initialization callbacks.
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)throws BeansException {

        System.out.println("postProcessAfterInitialization  : "+ beanName);

        return bean;
    }
}
