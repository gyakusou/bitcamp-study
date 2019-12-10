package com.eomcs.basic.ex03;

public class Exam1 {

  public static void main(String[] args) {
    //정수 리터럴
    System.out.println(78); //10진수 표기법
    //78이 정수 리터럴이다.

    System.out.println(+78); //10진수 표기법
    System.out.println(-78); //10진수 표기법

    System.out.println(0116); //8진수 표기법
    ////0116 
    //64 8 6
    System.out.println(-0116); //8진수 표기법

    System.out.println(0x4e); //16진수 표기법
    System.out.println(-0x4e); //16진수 표기법

    System.out.println(0b01001110); //8진수 표기법

    //부동소수점 리터럴
    System.out.println(3.14); // 고정소수점
    System.out.println(0.314e1); // 부동소수점
    System.out.println(31.4e-1); // 부동소수점
  
    //논리 리터럴
    System.out.println(true); // 대소문자 구분
    System.out.println(false); // 대소문자 구분

    //한 문자 리터럴
    System.out.println('A');
    System.out.println('가'); // 두글자 이상 쓰면 오류

    //문자열 리터럴
    System.out.println("안녕하세요");
    System.out.println("안녕하세요. 비트캠프!");

  }
}

//  1  0  0  1  0
//  24   23   22   21   20