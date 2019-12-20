package com.eomcs.basic.ex07.test;

public class Test01 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    // 입력 값: x, 리턴 값: x
    m1();
    
    // 입력 값: o, 리턴 값: x
    m2("홍길동"); // 기능이 실행할 때 필요한 값을 넣어준다.
    
    // 입력 값: x, 리턴 값: o
    String s;
    s = m3();
    System.out.println(s);
    
    // 입력 값: o 리턴 값: o
    String s2 = m4("홍길동"); // 홍길동 아규먼트
    System.out.println(s2);
    
    
  }
  static void m1() {
    System.out.println("Hello!"); // m1 펑션 () 이 기능을 수행하는데 필요한 값이 있다면 외부로 부터 받겠다.
  } // 이 기능을 실행할때 어떤 값도 받지 않고 리턴하지도 않습니다.
  
  static void m2(String name) {
    // 함수 안에 선언된 "(로컬 변수, local)"라 부른다.
    // 로컬 변수 중에서 함수(메서드)가 호출될때 넘어온 값을 받는 변수를 "(파라미터, parameter)"라고 한다.
    // 함수를 호출할 때 넘겨주는 값을 "(아규먼트, argument)"라 부른다.
    System.out.println("Hello, " + name);
  }
  static String m3() { //void는 리턴 받지 않는다.라는 뜻이기 때문에 리턴 타입 설정. 리턴 타입 스트링.
    String message = "Hello!";
    return message; // 값은 하나만 리턴이 가능하다. 
  }
  static String m4(String name) { // 스트링 네임 파라미터
    String message = name + "%s 님 안녕하세요!";
    return message;
  }
  }


