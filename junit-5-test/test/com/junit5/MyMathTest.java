package com.junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyMathTest {

    @Test
    public void sumWith3Number(){
        MyMath m = new MyMath();
        int sum = m.sum(new int[]{1,2,3});
        assertEquals(6,sum);
    }

    @Test
    public void sumWith1Number(){
        MyMath m = new MyMath();
        int sum = m.sum(new int[]{3});
        assertEquals(3,sum);
    }
}
