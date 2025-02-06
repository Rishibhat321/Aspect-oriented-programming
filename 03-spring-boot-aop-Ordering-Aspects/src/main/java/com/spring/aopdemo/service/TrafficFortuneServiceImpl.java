package com.spring.aopdemo.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

// component Scanning
@Service
public class TrafficFortuneServiceImpl implements TrafficFortuneService{

    @Override
    public String getFortune() {

        // simulate a delay
        // will delay for 5 seconds
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // return a fortune
        return "Expect heavy traffic this morning";
    }


}
