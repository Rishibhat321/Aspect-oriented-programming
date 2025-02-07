package com.springboot.thymeleafdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class DemoLoggingAspect {

    // setup logger
    private Logger myLogger = Logger.getLogger(getClass().getName());

    // setup pointcut declarations
    @Pointcut("execution(* com.springboot.thymeleafdemo.aspect.controller.*.*(..))")
    private void forControllerPackage() {}

    // do the same for service and dao package
    @Pointcut("execution(* com.springboot.thymeleafdemo.aspect.service.*.*(..))")
    private void forServicePackage() {}

    @Pointcut("execution(* com.springboot.thymeleafdemo.aspect.dao.*.*(..))")
    private void forDaoPackage() {}

    // combine pointcuts
    @Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage() ")
    private void forAppFlow() {}

    // add @Before advice
    @Before("forAppFlow()")
    public void before(JoinPoint theJoinPoint) {

        // display method we are calling
        String theMethod = theJoinPoint.getSignature().toShortString();
        myLogger.info("==> in @Before: calling method: " + theMethod);

        // display the arguments to the method

        // get the arguments
        Object[] args = theJoinPoint.getArgs();

        // loop through and display args
        for(Object tempArg : args) {
            myLogger.info("==> argument: " + tempArg);
        }

    }
}
