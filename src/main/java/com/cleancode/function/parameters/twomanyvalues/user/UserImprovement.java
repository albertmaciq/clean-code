package com.cleancode.function.parameters.twomanyvalues.user;

import lombok.Getter;

import java.util.Map;

@Getter
public class UserImprovement {

    private String name;
    private int age;
    private String email;

    public UserImprovement(Map<String, Object> userData) {
        this.name = (String) userData.get("name");
        this.age = (int) userData.get("age");
        this.email = (String) userData.get("email");
    }
}
