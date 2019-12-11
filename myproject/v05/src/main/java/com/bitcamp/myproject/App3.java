package com.bitcamp.myproject;

import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {

    java.util.Scanner keyboard = new java.util.Scanner(System.in);
    
    System.out.print("게시물 번호? ");
    String listNo = keyboard.nextLine();
    
    System.out.print("게시물 제목? ");
    String listNa = keyboard.nextLine();
    
    System.out.print("게시물 내용? ");
    String listCon = keyboard.nextLine();
    
    System.out.print("작성일? ");
    String listData = keyboard.nextLine();
    
    System.out.print("조회수? ");
    String views = keyboard.nextLine();
    
    
    System.out.println();
    
    
    System.out.printf("게시물번호: %s\n", listNo);
    System.out.printf("게시물제목: %s\n", listNa);
    System.out.printf("게시물내용: %s\n", listCon);
    System.out.printf("작성일: %s\n", listData);
    System.out.printf("조회수: %s\n", views);
    
    keyboard.close();

  }
}
