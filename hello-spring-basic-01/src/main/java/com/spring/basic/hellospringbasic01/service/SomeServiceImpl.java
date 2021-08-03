package com.spring.basic.hellospringbasic01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SomeServiceImpl implements SomeService{

    @Autowired
    SomeClientService someClientService;

    @Override
    public String getUser(String id) {
        return "Mark";
    }

    @Override
    public String getPosts() {
        return someClientService.getPosts().getTitle();
    }
}
