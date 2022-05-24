package com.example.spring.restapi.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@ToString

public class User {



    private int id;

    private int userId;

    private String title;

    private String body;

}
