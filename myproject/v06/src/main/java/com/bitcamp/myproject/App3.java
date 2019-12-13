package com.bitcamp.myproject;

import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    final int size = 100;
    
    String[] search = new String[size];
    String[] listinfo = new String[size];
    String[] subject = new String[size];
    String[] writer = new String[size];
    
    
    String response;
    
    int count = 0;
    
    for (int i = 0; i < 10; i++) {
      
      System.out.print("검색? ");
      search[i] = keyboard.next();
      keyboard.nextLine();
      
      System.out.print("게시물 제목+내용? ");
      listinfo[i] = keyboard.nextLine();
      
      System.out.print("제목만? ");
      subject[i] = keyboard.nextLine();
      
      System.out.print("글작성자? ");
      writer[i] = keyboard.nextLine();
      
      count++;
      
      System.out.println("계속 입력하시겠습니까? (y/n)");
      response = keyboard.next();
      
      if(!response.equalsIgnoreCase("y")) {
        break;
       }
    }
      
    System.out.println();
    
     for(int i = 0; i < count; i++) {
    
       System.out.printf("%s, %s, %s, %s", search[i], listinfo[i], subject[i], writer[i]);
       
       System.out.println();
    
    keyboard.close();
     }
  }
}

