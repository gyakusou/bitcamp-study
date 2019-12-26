package com.eomcs.oop.ex02.study;

public class Calculator {

  // 계산결과를 개별적으로 관리하고 싶다면, 인스턴스 필드로 선언한다.
  int result; // 필드값 은 자동 초기화 0 static 변수는 1개만 존재. 

  // 개별적으로 관리되는 변수 result 를 사용하고 싶다면,
  // 파라미터로 인스턴스 주소를 받아야 한다.
  // static 메서드 에서 인스턴스의 필드나 메서드를 사용할 수 없
  // 인스턴스 필드나 인스턴스 메서드를 사용하려면
  // 파라미터로 인스턴스 주소를 받아야 한다. reserved keyword

  void plus(int value) {
    this.result += value; // result = result + value
  }

  void minus(int value) {
    this.result -= value; // result = result - value
  }

  void mulitple(int value) {
    this.result *= value; // result = result * value
  }

  void devide(int value) {
    this.result /= value; // result = result / value
  }

}
