package com.spring.basic.hellospringbasic01.controller;

import com.spring.basic.hellospringbasic01.service.Post;
import com.spring.basic.hellospringbasic01.service.SomeClientService;
import com.spring.basic.hellospringbasic01.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SomeController {

    @Autowired
    private SomeService service;



    public String getUsername(String id){
        return service.getUser(id);
    }

    public String  getPosts(){
        return service.getPosts();
    }

}
