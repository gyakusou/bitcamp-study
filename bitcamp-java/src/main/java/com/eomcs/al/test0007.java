package com.eomcs.al;

// 짝수와 홀수

public class test0007 {
  public static void main(String[] args) {
    System.out.println(solution(12345));

  }

  public static String solution(int num) {
    if (num % 2 == 0)
      return "Even";
    return "Odd";

  }
}

// return num % 2 == 0 ? "Even" : "Odd";
