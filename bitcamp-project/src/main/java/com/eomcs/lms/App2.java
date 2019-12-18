package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    final int SIZE = 100; // 상수인 경우 대문자로 표현 

    int[] no = new int[SIZE];
    String[] name = new String[SIZE];
    String[] email = new String[SIZE];
    String[] password = new String[SIZE];
    String[] photo = new String[SIZE];
    String[] tel = new String[SIZE];
    Date[] regesteredDate = new Date[SIZE];

    int count = 0; // 입력 받은 만큼만 출력하겠다.

    for (int i = 0; i < SIZE; i++) {
      count++;

      System.out.print("번호? ");
      no[i] = keyboard.nextInt();

      System.out.print("이름? ");
      name[i] = keyboard.nextLine();
      keyboard.nextLine();

      System.out.print("이메일? ");
      email[i] = keyboard.nextLine();

      System.out.print("암호? ");
      password[i] = keyboard.nextLine();

      System.out.print("사진? ");
      photo[i] = keyboard.nextLine();

      System.out.print("전화? ");
      tel[i] = keyboard.nextLine();

      regesteredDate[i] = new Date(System.currentTimeMillis());

      System.out.println("계속 입력하시겠습니까? (Y/n)");
      String response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y"))
        break;
    }

    keyboard.close();

    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n", 
          no[i], name[i], email[i], tel[i], regesteredDate[i]);
    }
  }
}
