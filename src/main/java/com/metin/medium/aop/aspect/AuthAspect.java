package com.metin.medium.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthAspect {

    @Pointcut("within(com.metin.medium.aop.controller.secured.*)")
    public void pointCutForAuthentication() {
    }

    @Pointcut("within(com.metin.medium.aop.controller.secured.*)")
    public void pointCutForAuthorization() {
    }

    @Before("pointCutForAuthentication() && pointCutForAuthorization()")
    public void auth() {
        System.out.println("Auth the system...");
    }
}
