package com.spring.basic.hellospringbasic01.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;




@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearch {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int target){

        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm.getClass());

        return 3;
    }

//    @PostConstruct
//    public void postConstructor(){
//        logger.info("postConstructor ");
//    }
//
//    @PreDestroy
//    public void preDestroy(){
//        logger.info("preDestroy");
//    }

}

