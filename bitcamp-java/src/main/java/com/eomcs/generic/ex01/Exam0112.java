// 제네릭(Generic) - 사용 전 : 다형적 변수의 활용의 문제점
package com.eomcs.generic.ex01;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam0112 {
  
  // 다양한 객체를 저장하는 Box를 만들기 위해
  // 인스턴스의 변수 타입을 Object로 선언한다.
  // => 그러면 다음과 같이 한 개의 Box 클래스만 정의하면 된다.
  // 
  static class ObjectBox {
    Object value;
    
    public void set(Object value) {
      this.value = value;
    }
    
    public Object get() {
      return value;
    }
  }
  
  public static void main(String[] args) {
    
    // Member 객체를 저장하기 위해 다음과 같이 Box를 준비했다고 가정하자.
    ObjectBox box1 = new ObjectBox();
    
    // 원래는 다음과 같이 Member 객체를 넣으려고 box1을 준비한 것이다.
    box1.set(new Member("홍길동", 20));
    
    // 원래의 목적과 다르게 다음과 같이 Member가 아닌 String 객체를 넣어도 막을 방법이 없다. 
    box1.set(new String("Hello"));
    
    // 이유?
    // =? set() 파라미터 타입은 Object이기 때문이다.
    // => Object는 모든 자바 객체를 받을 수 있다.
    // 
    // 이렇게 Box 클래스의 인스턴스 변수를 Object로 선언하면
    // 다양한 객체를 보관할 수 있지만,
    // MemberBox나 StringBox, IntegerBox 처럼 특정 타입의 객체로 제한 할 수 없다.
    // 그렇다고 이 전 처럼 각 타입별로 Box 클래스를 정의하는 거은 바람직 하지 않다.
    //
    // 이런 문제점을 해결하기 위해 나온 문법이 제네릭(Generic)이다.
    // 제네릭 문법을 이용하면 한 개의 클래스가 다양한 타입의 변수를 제한적으로 다룰 수 있다.
    // 즉, 각 타입 별로 클래스를 정의해야 하는 것을 한 개의 클래스로 만들 수 있다.
    // => Exam0113.java를 확인해보라!
  }
}








