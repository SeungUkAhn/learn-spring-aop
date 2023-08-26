package com.maicoding.learnspringaop.aopexample.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutConfig {

    @Pointcut("execution(* com.maicoding.learnspringaop.aopexample.*.*.*(..))")
    public void businessAndDataPackageConfig(){}

    @Pointcut("execution(* com.maicoding.learnspringaop.aopexample.business.*.*(..))")
    public void businessPackageConfig(){}

    @Pointcut("execution(* com.maicoding.learnspringaop.aopexample.data.*.*(..))")
    public void dataPackageConfig(){}

    @Pointcut("bean(*Service*)")
    public void allPackageConfigUsingBean(){}
}
