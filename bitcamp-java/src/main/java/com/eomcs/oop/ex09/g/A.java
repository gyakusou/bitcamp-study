package com.eomcs.oop.ex09.g;

public interface A {
  /* public abstract */ void m1();

  default void m2() {} // default 규칙을 추가하되 기존의 규칙에 영향을 미치지 않는다.

  static void m3() {
    System.out.println("인터페이스도 스태틱 메서드를 가질 수 있다.");
  }
}
