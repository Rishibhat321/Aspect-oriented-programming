package com.spring.aopdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAOImpl implements AccountDAO{


    @Override
    public void addAccount() {

        System.out.println(getClass() + ": Doing my DB Work: Adding an ACCOUNT");

    }
}
