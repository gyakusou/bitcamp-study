package com.bitcamp.myproject;

import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {
    
    java.util.Scanner keyboard = new java.util.Scanner(System.in);
    
    System.out.print("회원번호? ");
    String no = keyboard.nextLine();
    
    System.out.print("이름? ");
    String name = keyboard.nextLine();
    
    System.out.print("이메일? ");
    String em = keyboard.nextLine();
    
    System.out.print("암호? ");
    String pw = keyboard.nextLine();
    
    System.out.print("사진? ");
    String pic = keyboard.nextLine();
    
    System.out.print("핸드폰번호? ");
    String phone = keyboard.nextLine();
    
    System.out.print("가입일? ");
    String joinData = keyboard.nextLine();
    
    System.out.println();
    
    
    System.out.printf("회원번호: %s\n", no);
    System.out.printf("이름: %s\n", name);
    System.out.printf("이메일: %s\n", em);
    System.out.printf("암호: %s\n", pw);
    System.out.printf("사진: %s\n", pic);
    System.out.printf("핸드폰번호: %s\n", phone);
    System.out.printf("가입일: %s\n", joinData);
    
    keyboard.close();
    
    
  }
}
