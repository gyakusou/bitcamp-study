package com.eomcs.basic.ex04;


// 형 변환 ; 형변환 규칙
public class Exam93 {
  
  
  public static void main(String[] args) {

    byte b = 127;
    short s = 32767;
    int i = 21_0000_0000;
    long l = 922_0000_0000_0000_0000L;
    float f = 3.14f;
    double d = 3.14;
    
    // 1. 정수 메모리끼리 형 변환 가능
    // 작은 메모리의 값을 큰 메모리에 넣을 때는 따로 형 변환 할 필요가 없다.
    l = i; // ok
    i = s; // ok
    s = b; // ok
    
    // 큰 메모리의 값을 작은 메모리에 넣을 때는 "명시적 형 변환을 수행해야한다."
    i = (int) l; // 단 값이 짤릴 수 있다.
    s = (short) i; // 단 값이 짤릴 수 있다.
    b = (byte) s; // 단 값이 짤릴 수 있다.
    
    // 2. 부동소수점을 정수 메모리에 저장 가능
    // 명시적 형 변환 필요 . 앞의 예제 참조
    
    // 3. 정수를 부동소수점을 메모리에 저장 가능. 명시적 형 변환 필요 없다.
    // 앞의 예제 참조
    
    //4. 숫자를 문자 변수에 저장 가능
    
    i = 65;
    char c = (char) i;
    System.out.println(c);
    
    // 그 외 형변환 불가!
    boolean bool;
    //bool = b; // 컴파일 오류
    //bool = s; // 컴파일 오류
    //bool = i; // 컴파일 오류
    //bool = l; // 컴파일 오류
    //bool = f; // 컴파일 오류
    //bool = d; // 컴파일 오류
    //bool = c; // 컴파일 오류

    //bool = "true"; // 컴파일 오류
    //i = "10"; // 컴파일 오류
    //c = "가"; // 컴파일 오류
    //f = "3.14"; // 컴파일 오류
    
    //i = bool; // 컴파일 오류
    //f = bool; // 컴파일 오류
    //c = bool; // 컴파일 오류
    //f = bool; // 컴파일 오류
  
  
  
  
   }
  }