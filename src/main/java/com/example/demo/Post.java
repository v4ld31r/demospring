package com.example.demo;

import lombok.Data;

import java.util.Date;

@Data
public class Post {

    private long id;
    public String message;
    public Date created_at;
    public Date update_at;

}
