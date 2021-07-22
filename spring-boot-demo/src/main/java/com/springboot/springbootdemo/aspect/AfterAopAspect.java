package com.springboot.springbootdemo.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class AfterAopAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @AfterReturning(
            value = "com.springboot.springbootdemo.aspect.CommonJoinPointConfig.businessLayerExecution()",
            returning = "result"
    )
    public void after(JoinPoint joinPoint, Object result) {
        logger.info(" {} return with value {}", joinPoint, result);
    }

    @After(value = "com.springboot.springbootdemo.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void afterThrowing(JoinPoint joinPoint) {
        logger.info(" after execution of {} ", joinPoint);
    }

}
