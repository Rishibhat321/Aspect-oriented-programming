package com.spring.aopdemo.dao;

import com.spring.aopdemo.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO{


    @Override
    public void addAccount(Account theAccount, boolean vipFlag) {

        System.out.println(getClass() + ": Doing my DB Work: Adding an ACCOUNT");
    }

    @Override
    public boolean doWork() {
        System.out.println(getClass() + ": doWork()");

        return false;
    }

/*
    @Override
    public void addAccount(Account theAccount) {

        System.out.println(getClass() + ": Doing my DB Work: Adding an ACCOUNT");

    }

 */

    // create fields to test Combining pointcut declarations(getters/setters)

    private String name;
    private String serviceCode;


    // getters/setters
    // adding statements just to make sure that the advices are being applied.
    public String getName() {
        System.out.println(getClass() + ": in getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass() + ": in setName()");
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println(getClass() +": in getServiceCode()");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println(getClass() +": in setServiceCode()");
        this.serviceCode = serviceCode;
    }


}
