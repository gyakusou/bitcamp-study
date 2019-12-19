package com.eomcs.lms;

import java.util.Scanner;

public class While1 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    Scanner keyboard = new Scanner(System.in);
    
    int count = 0;
    
    while (count < 5)
      System.out.println(count++);
    
    count = 0;
    while (count < 5) {
      System.out.println(count);
      count++;
    }

  }

}
