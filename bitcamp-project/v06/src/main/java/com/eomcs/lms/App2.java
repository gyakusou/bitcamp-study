package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    int[] no = new int[100];
    String[] name = new String[100];
    String[] email = new String[100];
    int[] password = new int[100];
    String[] photo = new String[100];
    String[] tel = new String[100];
    Date[] date1 = new Date[100];
    String response;

    int count = 0;
    for (int i = 0; i < 10; i++) {


      System.out.print("번호? ");
      no[i] = keyboard.nextInt();

      System.out.print("이름? ");
      name[i] = keyboard.nextLine();
      keyboard.nextLine();

      System.out.print("이메일? ");
      email[i] = keyboard.nextLine();

      System.out.print("암호? ");
      password[i] = keyboard.nextInt();

      System.out.print("사진? ");
      photo[i] = keyboard.nextLine();
      keyboard.nextLine();

      System.out.print("전화? ");
      tel[i] = keyboard.nextLine();

      System.out.print("가입일? ");
      date1[i] = Date.valueOf(keyboard.next());

      count++;

      System.out.println();

      System.out.print("계속 입력하시겠습니까? (y/n)");
      System.out.println();
      response = keyboard.next();

      if (!response.equalsIgnoreCase("y")) {
        break;
      }
    }

    System.out.println();

    for (int i = 0; i < count; i++) {

      System.out.printf("%d, %s, %s, %d, %s, %s, %s\n", no[i], name[i], email[i], password[i],
          photo[i], tel[i], date1[i]); 

    }


    System.out.println();


    keyboard.close();

  }
}
