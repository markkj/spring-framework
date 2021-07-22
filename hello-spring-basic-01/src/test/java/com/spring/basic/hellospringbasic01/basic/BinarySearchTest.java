package com.spring.basic.hellospringbasic01.basic;

import com.spring.basic.hellospringbasic01.HelloSpringBasic01Application;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
//@ContextConfiguration(classes = HelloSpringBasic01Application.class)
@ContextConfiguration(locations = "/testContext.xml")
public class BinarySearchTest {

    @Autowired
    BinarySearch binarySearch;

    @Test
    public void testBasicScenario(){
        int result = binarySearch.binarySearch(new int[]{},4);
        assertEquals(3,result);

    }

}

