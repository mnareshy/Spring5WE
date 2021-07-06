package com.spring5we.ioc.annotations.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
class SingleTonBeanAnnotation {
}
