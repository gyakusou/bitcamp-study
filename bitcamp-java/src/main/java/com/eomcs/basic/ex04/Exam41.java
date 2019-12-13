package com.eomcs.basic.ex04;

public class Exam41 {
  public static void main(String[] args) {

    // 문자 변수

    short s;
    char c;

    s = -32768;
    s = 32767;

    c = 0;
    c = 65535; // 문자코드는 음수가 없고 양수만 된다.

    // char 2진수로 된 문자코드가 저장된다. 미리 정의된 숫자가 저장. 문자에 정의된 UCS-2문자 코드값 저장.
    
    char c1 = 65;
    char c2 = 0x41;
    char c3 = 0b0100_0001;
    char c4 = 'A'; // 문자코드값을 변수에 리턴 한것.

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);

    //★
    int i1 = 'A'; // int값으로 출력을 명령했기 때문에 문자 'A'가 아닌 A의 코드값 65가 나온다.
    i1 = i1 + 10;
    System.out.println((char)i1); // 형변환 char 문자 변수 사용시에는 문자로 나온다.
    
    
    /* 
    문자코드를 숫자로 다루고싶다.
    int i1 = 'A';
    i1 = i1 + 10;
    System.out.println(i1);
    int는 정수 65 + 10 = 75 출력
    */  

    for (int i = 65; i < 'A' + 26; i++) {
      System.out.print((char)i);
    }




  }
}