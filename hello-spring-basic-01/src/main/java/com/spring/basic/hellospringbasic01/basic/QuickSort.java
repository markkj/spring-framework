package com.spring.basic.hellospringbasic01.basic;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSort implements SortAlgorithm{

    public int[] sort(int[] numbers){
        return numbers;
    }
}
