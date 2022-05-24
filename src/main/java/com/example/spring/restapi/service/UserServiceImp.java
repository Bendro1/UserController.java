package com.example.spring.restapi.service;

import com.example.spring.restapi.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImp implements UserService{

    private static List<User>list=new ArrayList<>();



    static{

        User e =new User();
        e.setId(1);
        e.setUserId(222);
        e.setTitle("Titulok 1");
        e.setBody("Telo 1 ");
        list.add(e);

        e =new User();
        e.setId(2);
        e.setUserId(114);
        e.setTitle("Titulok 2");
        e.setBody("Telo 2 ");
        list.add(e);
    }
    @Override
    public List<User> getUsers() {

        return list;
    }
}
