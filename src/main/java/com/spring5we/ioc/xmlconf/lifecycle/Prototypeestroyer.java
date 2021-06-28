package com.spring5we.ioc.xmlconf.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.LinkedList;
import java.util.List;

public class Prototypeestroyer implements ApplicationContextAware, DisposableBean, BeanPostProcessor {

    private ApplicationContext context;
    List<Object> prototypeBeans = new LinkedList<Object>();

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (context.isPrototype(beanName)) {
            synchronized (prototypeBeans) {
                prototypeBeans.add(bean);
            }
        }

        return bean;
    }

    @Override
    public void destroy() throws Exception {

        synchronized (prototypeBeans) {
            for (Object bean : prototypeBeans) {
                if (bean instanceof DisposableBean) {
                    DisposableBean disposable = (DisposableBean)bean;
                    try {
                        disposable.destroy();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            prototypeBeans.clear();
        }


    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        this.context = applicationContext;

    }


}
