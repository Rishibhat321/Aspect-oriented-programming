package com.spring.aopdemo;

public class Account {

    // fields
    private String name;
    private String level;

    // define constructors
    public Account() {

    }

    public Account(String name, String level) {
        this.name = name;
        this.level = level;
    }

    // getters/setters
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // define toString method

    @Override
    public String toString() {
        return "Account{" +
                "level='" + level + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
