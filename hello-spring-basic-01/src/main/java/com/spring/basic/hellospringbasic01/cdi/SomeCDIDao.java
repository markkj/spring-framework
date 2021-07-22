package com.spring.basic.hellospringbasic01.cdi;

import org.springframework.stereotype.Component;

@Component
public class SomeCDIDao {



    public int[] getData(){
        return new int[]{5,89,100};
    }

}
