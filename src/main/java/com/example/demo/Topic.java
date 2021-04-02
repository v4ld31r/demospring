package com.example.demo;

import lombok.Data;

import java.util.Date;

@Data
public class Topic {

    private long id;
    public String subject;
    public Date last_update;

}
