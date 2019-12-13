package com.bitcamp.myproject;

import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    final int size = 100;
    
    int[] no = new int[size];
    String[] name = new String[size];
    String[] email = new String[size];
    String[] password = new String[size];
    String[] tel = new String[size];
    int[] luckno = new int[size];
    
    String response; //
    
    int count = 0; //
    for (int i = 0; i < 10; i++) {
      
      System.out.print("회원번호?(숫자만 적어주세요)");
      no[i] = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("이름? ");
      name[i] = keyboard.nextLine();
      
      System.out.print("이메일? ");
      email[i] = keyboard.nextLine();
      
      System.out.print("암호? ");
      password[i] = keyboard.nextLine();
      
      System.out.print("핸드폰번호? ");
      tel[i] = keyboard.nextLine();
      
      System.out.print("응모번호?(숫자만적어주세요) ");
      luckno[i] = keyboard.nextInt();
      keyboard.nextLine();
      
      count++;
      
      System.out.println("계속 입력하시겠습니까? (y/n)");
      
      System.out.println();
      response = keyboard.next();
      
      if(!response.equalsIgnoreCase("y")) {
        break;
      }
    }
      
    
      System.out.println();
      
      for (int i = 0; i < count; i++) {
        
        System.out.printf("%d, %s, %s, %s, %s, %d", no[i], name[i], email[i], password[i], 
            tel[i], luckno[i]);
        
        System.out.println();
      }
      
      keyboard.close();
      
    }
      
    
    
    
    
    
    
  }

