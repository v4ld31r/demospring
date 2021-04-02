package com.example.demo;

import lombok.Data;

@Data
public class User {

    private long id;
    public String name;
    public String password;
    public String email;
    public Boolean is_superuser;

}
