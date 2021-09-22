package com.spring5we.ioc.xmlconf.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/*InitializingBean: Declares the afterPropertiesSet() method which can be used to write the initialization logic.
 The container calls the method after properties are set.
DisposableBean: Declares the destroy() method which can be used to write any clean up code.
The container calls this method during bean destruction in shutdown.
*/

public class BeanInitilizeAndDisposalBean implements InitializingBean, DisposableBean {


    @Override
    public void destroy() throws Exception {

        System.out.println("DisposableBean destroy() BeanInitilizeAndDisposal");

    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("InitializingBean afterPropertiesSet() BeanInitilizeAndDisposal");

    }
}
