package com.eomcs.basic.ex06x.assignment;

// 오버로딩 같은 이름으로 메소드 만든다.

public class Graphic {

  static void drawLine(int length) {
    int x = 0;
    while (x++ < length) {
      System.out.print("*");
    }
  }
  
  static void drawLine(int length, char ch) {
    int x = 0;
    while (x++ < length) {
      System.out.print(ch);
    }
  }
}
