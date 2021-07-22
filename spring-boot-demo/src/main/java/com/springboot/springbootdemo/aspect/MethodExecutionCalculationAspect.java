package com.springboot.springbootdemo.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class MethodExecutionCalculationAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("execution(* com.springboot.springbootdemo.aspect.CommonJoinPointConfig.dataLayerExecution())")
    public void after(ProceedingJoinPoint joinPoint) throws Throwable {
        //startTime = x
        // allow execution
        // endTime = y
        long startTime = System.currentTimeMillis();
        joinPoint.proceed();
        long timeTaken = System.currentTimeMillis() - startTime;
        logger.info("Time taken by {} is {}",joinPoint,timeTaken);
    }

}
