package com.maicoding.learnspringaop.aopexample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Before("execution(* com.maicoding.learnspringaop.aopexample.*.*.*(..))")
    public void logMethodCallBeforeExecution(JoinPoint joinPoint){
        logger.info("Before Aspect - {} is called with args: {}", joinPoint, joinPoint.getArgs());
    }

    @After("execution(* com.maicoding.learnspringaop.aopexample.*.*.*(..))")
    public void logMethodCallAfterExecution(JoinPoint joinPoint){
        logger.info("After Aspect - {} is executed", joinPoint);
    }

    @AfterThrowing(
        pointcut = "execution(* com.maicoding.learnspringaop.aopexample.*.*.*(..))",
        throwing = "exception")
    public void logMethodCallAfterException(JoinPoint joinPoint, Exception exception){
        logger.info("AfterThrowing Aspect - {} has thrown an exception: {}", joinPoint, exception);
    }

    @AfterReturning(
        pointcut = "execution(* com.maicoding.learnspringaop.aopexample.*.*.*(..))",
        returning = "resultValue")
    public void logMethodCallAfterSuccess(JoinPoint joinPoint, Object resultValue){
        logger.info("AfterReturning Aspect - {} successfully returned {}", joinPoint, resultValue);
    }
}
