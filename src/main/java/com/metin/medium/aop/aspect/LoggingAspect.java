package com.metin.medium.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.metin.medium.aop.controller.CourseController.registerCourse(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println(joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getTarget());
        System.out.println(joinPoint.getSignature());
        System.out.println("before logged...");
    }

    @After("execution(* com.metin.medium.aop.controller.*.*(..))")
    public void logAfter() {
        System.out.println("after logged...");
    }

    @Pointcut("execution(* com.metin.medium.aop.controller.*.totalStudents(..))")
    public void pointCutForAfterReturning() {}

    @AfterReturning(pointcut = "pointCutForAfterReturning()", returning = "count")
    public void returnValue(int count) {
        System.out.println("Return Value...");
        System.out.println("Count = " + count);
    }
}
