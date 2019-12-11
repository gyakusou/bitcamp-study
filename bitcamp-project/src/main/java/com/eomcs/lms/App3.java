package com.eomcs.lms;

import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {

    java.util.Scanner keyboard = new java.util.Scanner(System.in);
    
    System.out.print("번호?");
    String no = keyboard.nextLine();
    
    System.out.print("내용?");
    String contents = keyboard.nextLine();
    
    System.out.print("작성일?");
    String data = keyboard.nextLine();
    
    System.out.print("조회수?");
    String views = keyboard.nextLine();
    
    System.out.println();
    
    System.out.printf("번호: %s\n", no); 
    System.out.printf("내용: %s\n ", contents);
    System.out.printf("작성일: %s\n", data);
    System.out.printf("조회수: %s\n", views);
    
    keyboard.close();
  }
}
