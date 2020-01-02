package com.eomcs.oop.ex05.test;

public class A {
  
  int v1;
  
  A() { // 생성자에서 다른 생성자 소환하기
    this(100); //반드시 첫번째로 와야한다.
    // this.v1 = 100; // 인스턴스 주소를 담고있는 변수로서 사용
    System.out.println("A()");
  }
  
  A(int v1) {
    this.v1 =v1;
    System.out.println("A(int)");
  }
}
