// 특정 메서드 호출 전후에 실행되는 클래스
package com.eomcs.spring.ioc.ex13.e;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

// Advice 객체를 IoC 컨테이너에 등록한다.
@Component

// 이 객체가 AOP Advice 를 설정하는 객체임을 표시한다.
@Aspect
public class MyAdvice {

  // XML 설정 예:
  // <aop:before
  // pointcut="execution(* com.eomcs.spring.ioc.ex13.e.X.*(..)) and args(a,b)"
  // method="doBefore"/>
  @Before("execution(* com.eomcs.spring.ioc.ex13.e.X.*(..)) and args(x,y)")
  public void doBefore(int x, int y) {
    System.out.printf("MyAdvice.doBefore(): %d, %d\n", x, y);
  }

  // XML 설정 예:
  // <aop:after-returning
  // pointcut="execution(* com.eomcs.spring.ioc.ex13.e.X.*(..))"
  // method="doAfterReturning"
  // returning="returnValue"/>

  @AfterReturning(pointcut = "execution(* com.eomcs.spring.ioc.ex13.e.X.*(..))",
      returning = "returnValue")
  public void doAfterReturning(Object returnValue) {
    System.out.printf("MyAdvice.doAfterReturning(): %d\n", returnValue);
  }

  // XML 설정 예:
  // <aop:after-throwing
  // pointcut="execution(* com.eomcs.spring.ioc.ex13.e.X.*(..))"
  // method="doAfterThrowing" throwing="error"/>

  @AfterThrowing(pointcut = "execution(* com.eomcs.spring.ioc.ex13.e.X.*(..))", throwing = "error")
  public void doAfterThrowing(Exception error) {
    System.out.printf("MyAdvice.doAfterThrowing(): %s\n", error.getMessage());
  }
}


