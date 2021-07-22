package com.springboot.springbootdemo.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut("execution(* com.springboot.springbootdemo.aop.data.*.*(..))")
    public void dataLayerExecution(){}

    @Pointcut("execution(* com.springboot.springbootdemo.aop.business.*.*(..))")
    public void businessLayerExecution(){}
}
