package com.eomcs.al;

import java.util.Arrays;

public class test0005 {
  public static void main(String[] args) {
    System.out.println(solution(new String[] {"aaa", "kim", "ccc"}));
  }

  public static String solution(String[] seoul) {
    return "김서방은 " + Arrays.asList(seoul).indexOf("kim") + "에 있다.";
  }
}

// Arrays.asList() Arrays의 private 정적 클래스인 ArrayList를 리턴한다.
