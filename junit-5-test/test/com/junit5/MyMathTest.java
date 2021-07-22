package com.junit5;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class MyMathTest {

    @BeforeEach
    public void before(){
        System.out.println("before");
    }

    @AfterEach
    public void after(){
        System.out.println("after");
    }

    @BeforeAll
    public static void beforeClass(){
        System.out.println("beforeClass");
    }

    @AfterAll
    public static void afterClass(){
        System.out.println("afterClass");
    }

    @Test
    public void sumWith3Number(){
        MyMath m = new MyMath();
        System.out.println("test1");
        int sum = m.sum(new int[]{1,2,3});
        assertEquals(6,sum);
    }

    @Test
    public void sumWith1Number(){
        MyMath m = new MyMath();
        System.out.println("test2");
        int sum = m.sum(new int[]{3});
        assertEquals(3,sum);
    }
}
