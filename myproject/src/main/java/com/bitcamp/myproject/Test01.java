package com.bitcamp.myproject;

import java.util.Scanner;

public class Test01 {
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    
    
    
    System.out.print("값1 ?");
    int a = keyboard.nextInt();
    keyboard.nextLine();
    
    System.out.print("값2 ?");
    int b = keyboard.nextInt();
   
    System.out.println("10");
    switch(10) {
      case 1:
        System.out.println(30);
      case 2:
        System.out.println(200);
    }
    
   
    System.out.println();
    
    System.out.printf(a + "+" + b);
    System.out.printf(a + "-" + b);
    System.out.printf(a + "*" + b);
    System.out.printf(a + "/" + b);
    
    
    
    
    
    /*
    System.out.println(num1+num2);
    System.out.println(num1-num2);
    System.out.println(num1*num2);
    System.out.println(num1/num2);
    */
    
    keyboard.close();
    
    
  }
}
