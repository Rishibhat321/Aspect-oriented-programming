package com.spring.aopdemo.dao;

import com.spring.aopdemo.Account;

public interface AccountDAO {

  //  void addAccount(Account theAccount);

    // adding more params

    void addAccount(Account theAccount, boolean vipFlag);

    boolean doWork();

    // allows to call the getter/setter methods via the AccountDAO interface
    public String getName();

    public void setName(String name);

    public String getServiceCode();

    public void setServiceCode(String serviceCode);

}
