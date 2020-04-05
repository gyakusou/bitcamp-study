package com.eomcs.al;

public class test0004 {
  public static void main(String[] args) {
    System.out.println(solution(new String[] {"aaa", "kim", "ccc"}));

  }

  public static String solution(String[] seoul) {
    int idx = 0;
    for (int i = 0; i < seoul.length; i++) {
      if (seoul[i].equals("kim"))
        idx = i;
    }
    return String.format("김서방은 %d에 있다", idx);

  }
}
