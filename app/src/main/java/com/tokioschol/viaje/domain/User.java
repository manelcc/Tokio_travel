package com.tokioschol.viaje.domain;

public class User {
    private final String name;
    private final String lastName;
    private final Integer age;

    public User(String name, String lastName, Integer age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public String getLastName() {
        return lastName;
    }


    public Integer getAge() {
        return age;
    }

}
