package com.bitcamp.myproject;

import java.util.Scanner;

public class If2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("나이를 입력하세요: ");
    int age = keyboard.nextInt();
    
    if (age < 8) {
      System.out.println("아동입니다.");
    } else if (age < 19) {
      System.out.println("청소년입니다.");
    } else if (age < 30) {
      System.out.println("청년입니다.");
    } else if (age < 60) {
      System.out.println("중년입니다.");
    } else 
      System.out.println("노인입니다.");
    }
  
  // 메인 안에서만 사용하게 되면 깔끔하게 정리 가능하다.
  
  /*
   if (age < 8) 
      System.out.println("아동입니다.");
     else if (age < 19) 
      System.out.println("청소년입니다.");
     else if (age < 30) 
      System.out.println("청년입니다.");
     else if (age < 60) 
      System.out.println("중년입니다.");
     else 
      System.out.println("노인입니다.");
    */
  
}
