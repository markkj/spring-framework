package com.springboot.springbootdemo.aop.business;


import com.springboot.springbootdemo.aop.data.Dao1;
import com.springboot.springbootdemo.aspect.TrackTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    @Autowired
    private Dao1 dao1;

    @TrackTime
    public String calculateSomething(){
        return dao1.retrieveSomething();
    }

}
