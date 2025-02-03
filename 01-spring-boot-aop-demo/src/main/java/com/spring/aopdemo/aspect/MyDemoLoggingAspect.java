package com.spring.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    // this is where we add all of our related advices for logging

    // starting with an @Before Advice

    /*
    // this will be applied only on the addAccount method...
    @Before("execution(public void addAccount())")
  // @Before("execution(public void updateAccount())")
    public void beforeAddAccountAdvice() {

        System.out.println("\n==> Executing @Before advice on method addAccount()");

    //   System.out.println("\n==> Executing @Before advice on method");
    }
     */


    // if we want to apply @Before Advice only on specific method (for which we have 2 methods with the same name)
    // will match on interface or class that implements the interface
    // package name + class/interface name
    // advice will not be applied to membership interface(here)
    @Before("execution(public void com.spring.aopdemo.dao.AccountDAO.addAccount())")
    public void beforeAddAccountAdvice() {

        System.out.println("\n==> Executing @Before advice on method");
    }

}
