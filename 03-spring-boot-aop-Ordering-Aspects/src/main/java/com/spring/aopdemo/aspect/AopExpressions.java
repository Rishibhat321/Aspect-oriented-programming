package com.spring.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpressions {

    // change the access modifiers from private to public

    // Pointcut Declarations
    @Pointcut("execution(* com.spring.aopdemo.dao.*.*(..))")
    public void forDaoPackage() {}

    // create a pointcut declaration for getter methods (.get*)
    @Pointcut("execution(* com.spring.aopdemo.dao.*.get*(..))")
    public void getter() {}

    // create a pointcut for setter methods  (.set*)
    @Pointcut("execution(* com.spring.aopdemo.dao.*.set*(..))")
    public void setter() {}

    // create a pointcut: include package and exclude getter/setter
    // no advices will be applied on getter/setter methods
    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public void forDaoPackageNoGetterSetter() {}


}
