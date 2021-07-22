package com.springboot.springbootdemo.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut("execution(* com.springboot.springbootdemo.aop.data.*.*(..))")
    public void dataLayerExecution() {
    }

    @Pointcut("execution(* com.springboot.springbootdemo.aop.business.*.*(..))")
    public void businessLayerExecution() {
    }

    @Pointcut("dataLayerExecution() && businessLayerExecution()")
    public void allLayerExecution() {
    }
    @Pointcut("bean(*dao*)")
    public void beanContainingWithDao(){}

    @Pointcut("within(com.springboot.springbootdemo.aop.data..*)")
    public void dataLayerExecutionWithWithin() {
    }

    @Pointcut("@annotation(com.springboot.springbootdemo.aspect.TrackTime)")
    public void trackTimeAnnotation() {
    }
}
