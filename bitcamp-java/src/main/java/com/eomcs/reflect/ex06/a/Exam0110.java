package com.eomcs.reflect.ex06.a;

import java.lang.reflect.Proxy;

// 프록시 객체를 만드는 방법
public class Exam0110 {
  public static void main(String[] args) {

    MyInterface obj = (MyInterface) Proxy.newProxyInstance( //
        Exam0110.class.getClassLoader(), // 클래스를 메모리에 로딩하는 일을 할 객체
        new Class[] {MyInterface.class}, // 자동 생성 할 클래스가 구현해야 하는 인터페이스 목록 // 레퍼런스배열 1개
        new MyInvocationHandler()); // InvocationHandler

    obj.m1();
    obj.m2();
  }
}


//
//// 레퍼런스(주소를 담는 변수) 이름을 각각 설정 할 수 있으나 대량으로 만들기 힘들다.
// String s1, s2, s3;
// s1 = new String();
// s2 = new String();
// s3 = new String();
//
//// 레퍼런스 배열 (대량의 레퍼런스를 만들 수 있으나, 이름이 하나 인덱스로 구분)
// String[] strArray = new String[3];
// strArray[0] = new String();
// strArray[1] = new String();
// strArray[2] = new String();

// String s = new String();
//
// Class c1, c2, c3;
// c1 = s.getClass(); // 클래스 정보 리턴 - 인스턴수 주소를 알때 방법
// c2 = Class.forName("java.lang.String"); // 클래스의 전체 이름을 준다.
// c3 = String.class; // 빌트인 클래스 변수 - 클래스 정보가 담겨져있다.
//
// Class[] classArray = new Class[3];
// classArray[0] = s.getClass();
// classArray[1] = Class.forName("java.lang.String");
// classArray[2] = String.class;
//
// Class[] classArray2 = new Class[] { //
// s.getClass(), //
// Class.forName("java.lang.String"), //
// String.class};
//
// Class[] classArray3 = { //
// s.getClass(), //
// Class.forName("java.lang.String"), //
// String.class};
//
// Class[] classArray4; // 안됀다.
// classArray4 = { //
// s.getClass(), //
// Class.forName("java.lang.String"), //
// String.class};
