package com.bitcamp.myproject;

import java.sql.Date;
import java.util.Scanner;

public class Test0001 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner keyboard = new Scanner(System.in);

    final int SIZE = 30;

    int[] no = new int[SIZE];
    String[] name = new String[SIZE];
    Date[] startDate = new Date[SIZE];
    Date[] endDate = new Date[SIZE];

    int count = 0;
    for (int i = 0; i < SIZE; i++) {

      count++;

      System.out.print("번호? ");
      no[i] = keyboard.nextInt();
      keyboard.nextLine();

      System.out.print("이름? ");
      name[i] = keyboard.nextLine();

      System.out.print("시작일? ");
      startDate[i] = Date.valueOf(keyboard.next());

      System.out.print("종료일? ");
      endDate[i] = Date.valueOf(keyboard.next());

      System.out.print("계속 입력하시겠습니까? (y/n)");
      
      System.out.println();

      String response = keyboard.next();
      if (!response.equalsIgnoreCase("y"))
        break;
    }

    System.out.println();

    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s ~ %s\n", no[i], name[i], startDate[i], endDate[i]);
    }
    keyboard.close();
  }

}
