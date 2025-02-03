package com.spring.aopdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAOImpl implements MembershipDAO{


    @Override
    public void addAccount() {

        System.out.println(getClass() + ": Doing my DB Work: Adding a MEMBERSHIP ACCOUNT");

    }
}
