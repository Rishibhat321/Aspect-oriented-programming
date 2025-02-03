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


}
