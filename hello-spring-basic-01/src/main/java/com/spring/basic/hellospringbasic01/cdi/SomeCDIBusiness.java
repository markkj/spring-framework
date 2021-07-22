package com.spring.basic.hellospringbasic01.cdi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCDIBusiness {

    @Inject
    SomeCDIDao someCDIDao;

    public SomeCDIDao getSomeCDIDao() {
        return someCDIDao;
    }

    public void setSomeCDIDao(SomeCDIDao someCDIDao) {
        this.someCDIDao = someCDIDao;
    }

    public int findGreatest(){
        int greatest = Integer.MIN_VALUE;
        int[] data = someCDIDao.getData();
        for (int value:
             data) {
            if(value > greatest)
                greatest = value;
        }
        return greatest;
    }

}
