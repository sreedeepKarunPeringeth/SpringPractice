package com.springAOP.AOPDemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//Pointcut
	//Weaving and weaver
	@Before("execution(* com.springAOP.AOPDemo.data.*.*(..))")
	public void before(JoinPoint joinPoint){
		//Advice
		logger.info("intercepted {}", joinPoint);
	}
}
