// 과제1 : 계산기 애플리케이션을 작성하라.

/*
값1? 10
값2? 20
연산자(+,-,*,/)?
10+20=30
*/

package com.eomcs.basic.ex04.assignment2;

import java.util.Scanner;

//import sun.tools.jstat.SymbolResolutionClosure;

public class Test013 {
  public static void main(String[] args) {

    Scanner KeyScan = new Scanner(System.in);

    System.out.print("값1? ");
    int a = KeyScan.nextInt();

    System.out.println("값2? ");
    int b = KeyScan.nextInt();

    System.out.println("연산자(+,-,*,/)?");
    String op = KeyScan.next();

    KeyScan.close();
    
    if (op.equals("+")) {
      System.out.println("+");
    } else if (op.equals("-")) {
      System.out.println("-");
    } else if (op.equals("*")) {
      System.out.println("*");
    } else if (op.equals("/")) {
      System.out.println("/");
    } else {
      System.out.println("사용할 수 없습니다.");
    }
  
    System.out.printf("%d %s %d = 30/n", a, op, b);
    
  }
}