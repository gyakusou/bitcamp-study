package com.eomcs.oop.ex08.test;

class A1 {} // package member class

class A2 {} // package member class

public class A { // package member class
  
  // nested class
  // => non-static nested class = inner class
  class X {} 
  
  // static nested class
  static class X2 {}
  
  void m( ) {
    // local class 메서드 안에 선언되는 클래스.
    class Y {}
    
   // anonymous class (익명클래스) 이름이 없는 클래스 익명으로 만들 때는 최소 수퍼클래스 명을 지정해야 한다. 
    Object obj = new Object() {
      @Override
      public String toString () {
        return "익명클래스";
      }
    };
   }
  
  
}
