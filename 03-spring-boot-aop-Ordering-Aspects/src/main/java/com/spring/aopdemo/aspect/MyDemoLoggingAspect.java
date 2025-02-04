package com.spring.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
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


    /*
    // if we want to apply @Before Advice only on specific method (for which we have 2 methods with the same name)
    // will match on interface or class that implements the interface
    // package name + class/interface name
    // advice will not be applied to membership interface(here)
    @Before("execution(public void com.spring.aopdemo.dao.AccountDAO.addAccount())")
    public void beforeAddAccountAdvice() {

        System.out.println("\n==> Executing @Before advice on method");
    }

     */


    /*
    // using wildcards
    // Match method starting with "add" in any class.
    @Before("execution(public void add*())")
    public void beforeAddAccountAdvice() {

        System.out.println("\n==> Executing @Before advice on method");
    }
     */


    // Match methods based on return type
    // Match on any modifier - *
  //  @Before("execution(* void add*()")
    // Modifier is optional
    /*
    @Before("execution(void add*())")
    public void beforeAddAccountAdvice() {

        System.out.println("\n==> Executing @Before advice on method");
    }

     */


/*
    // Match on any return type
    // wildcard (*)
    // Parameter types with Pointcut Expression
    @Before("execution(* add*(com.spring.aopdemo.Account))")
    public void beforeAddAccountAdvice() {

        System.out.println("\n==> Executing @Before advice on method");
    }

 */


    /*
    // adding more params
    // wildcard(..) will match on any number of arguments
    @Before("execution(* add*(com.spring.aopdemo.Account, ..))")
    public void beforeAddAccountAdvice() {

        System.out.println("\n==> Executing @Before advice on method");
    }

     */


/*
    // for matching on any parameter
    @Before("execution(* add*(..))")
    public void beforeAddAccountAdvice() {

        System.out.println("\n==> Executing @Before advice on method");
    }

 */


    /*
    // matching methods based on package name
    // based on package name
    // return type(*) wildcard
    // package name
    // .*.*(..) - for matching on any class, any method and (..) for any number of params
    @Before("execution(*  com.spring.aopdemo.dao.*.*(..))")
    public void beforeAddAccountAdvice() {

        System.out.println("\n==> Executing @Before advice on method");
    }

     */


    /*
    // Applying pointcut to advice
    @Before("forDaoPackage()")
    public void beforeAddAccountAdvice() {
        System.out.println("\n==> Executing @Before advice on method");

    }

    // re-use pointcut declaration and applying to another advice.
    @Before("forDaoPackage()")
    public void performApiAnalytics() {
        System.out.println("\n==> Performing API Analytics");
    }

     */

    // fully qualifies class name package name + class name

    @Before("com.spring.aopdemo.aspect.AopExpressions.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice() {
        System.out.println("\n==> Executing @Before advice on method");

    }


}
