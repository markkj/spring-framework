package com.spring.basic.hellospringbasic01.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "someClientService", url = "https://jsonplaceholder.typicode.com/")
public interface SomeClientService {

    @GetMapping("/posts/1")
    Post getPosts();
}

