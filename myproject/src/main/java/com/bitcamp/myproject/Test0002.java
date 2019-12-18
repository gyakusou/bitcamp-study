package com.bitcamp.myproject;

import java.sql.Date;
import java.util.Scanner;

public class Test0002 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner keyboard = new Scanner(System.in);

    final int SIZE = 30;

    int[] no = new int[SIZE];
    String[] title = new String[SIZE];
    Date[] startDate = new Date[SIZE];
    Date[] endDate = new Date[SIZE];

    int count = 0;
    for (int i = 0; i < SIZE; i++) {

      count++;

      System.out.print("번호? ");
      no[i] = keyboard.nextInt();
      keyboard.nextLine();

      System.out.print("수업명? ");
      title[i] = keyboard.nextLine();

      System.out.print("시작일? ");
      startDate[i] = Date.valueOf(keyboard.nextLine());

      System.out.print("종료일? ");
      endDate[i] = Date.valueOf(keyboard.nextLine());

      System.out.println("계속 입력하시겠습니까? (y/n)");
      
      System.out.println();
      
      String response = keyboard.next();
      if (!response.equalsIgnoreCase("y"))
        break;
    }

    System.out.println();

    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s ~ %s\n", no[i], title[i], startDate[i], endDate[i]);
    }
    keyboard.close();
  }
  
}
