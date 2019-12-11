package com.eomcs.lms;

import java.util.Scanner; // Scanner 기능을 사용하기 위해 java.util 패키지에 있는 Scanner 클래스를 불러오겠다.

public class Pra1 {
    public static void main(String[] args) {
      
      java.util.Scanner keyboard = new java.util.Scanner(System.in); // keyboard 사용하겠다.
      
      System.out.print("이름?");
      String name = keyboard.nextLine();
      
      System.out.print("시작?");
      String startData = keyboard.nextLine();

      System.out.print("끝?");
      String endData = keyboard.nextLine();
      
      System.out.println(); //공백
      
      System.out.printf("이름: %s\n", name);
      System.out.printf("기간: %s ~ %s\n", startData, endData);
    
      keyboard.close(); // 키보드 사용을 끝내겠다.
      
  }
}
