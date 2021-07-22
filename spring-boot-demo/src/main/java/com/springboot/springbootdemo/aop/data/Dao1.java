package com.springboot.springbootdemo.aop.data;


import com.springboot.springbootdemo.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

    @TrackTime
    public String retrieveSomething(){
        return "Dao1";
    }

}
