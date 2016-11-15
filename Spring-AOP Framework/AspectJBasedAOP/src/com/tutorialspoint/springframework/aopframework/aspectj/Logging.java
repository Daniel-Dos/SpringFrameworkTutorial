package com.tutorialspoint.springframework.aopframework.aspectj;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author daniel
 * Daniel-Dos
 * daniel.dias.analistati@gmail.com
 */
@Aspect
public class Logging {

	/**
	 * Following is the definition for a pointcut to select
	 * all the methods available. So advice will be called
	 * for all the methods.
	 */
	@Pointcut("execution(* com.tutorialspoint.springframework.aopframework.aspectj.*.*(..))")
	private void selectALL(){}

	/**
	 * This is the method which I would like to execute
	 * before a selected method execution.
	 */
	@Before("selectALL()")
	public void beforeAdvice() {
		System.out.println("Going to setup student profile.");
	}

	/**
	 * This is the method which I would like to execute
	 * after a selected method execution.
	 */
	@After("selectALL()")
	public void afterAdvice() {
		System.out.println("Student profile has been setup.");
	}

	/**
	 * This is the method which I would like to execute
	 * when any method returns.
	 */
	@AfterReturning(pointcut = "selectALL()", returning= "retVal")
	public void afterReturingAdvice(Object retVal) {
		System.out.println("Returning:" + retVal.toString());
	}

	@AfterThrowing(pointcut = "selectALL()", throwing = "ex")
	public void afterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("There has been an exception: " + ex.toString());
	}
}