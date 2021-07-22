package com.springboot.springbootdemo.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class UseAccessAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

//        @Before("execution(* com.springboot.springbootdemo.aop.data.*.*(..))")
    @Before("com.springboot.springbootdemo.aspect.CommonJoinPointConfig.dataLayerExecution()")
    public void before(JoinPoint joinPoint) {
        logger.info(" Check for user access");
        logger.info(" Allowed executions  {}", joinPoint);
    }

}
