package com.eomcs.basic.ex06x.assignment;

import java.util.Scanner;

public class Testmy1 {
  public static void main(String[] args) {

    Scanner keyScan = new Scanner(System.in);

    System.out.println("밑변의 길이? ");
    int leng = keyScan.nextInt();

    if (leng == 1) {
      System.out.println("*");
    } else if (leng == 2) {
      System.out.println("*");
      System.out.println("**");
    } else if (leng == 3) {
      System.out.println("*");
      System.out.println("**");
      System.out.println("***");
    } else if (leng == 4) {
      System.out.println("*");
      System.out.println("**");
      System.out.println("***");
      System.out.println("****"); 
    } else if (leng == 5) {
      System.out.println("*");
      System.out.println("**");
      System.out.println("***");
      System.out.println("****");
      System.out.println("*****");
    }

    keyScan.close();
  }
}

