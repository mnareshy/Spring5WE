package com.spring5we.ioc.annotations.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeCustomDestroyAnnotation implements DisposableBean {


    void businessMethod() {

        System.out.println(" Business Method");
    }

    @Override
    public void destroy() throws Exception {

        System.out.println("Cleaning the Prototype Bean Using CUstom Destroy impementation");

    }
}
