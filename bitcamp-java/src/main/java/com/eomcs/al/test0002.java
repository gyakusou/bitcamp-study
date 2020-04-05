package com.eomcs.al;

public class test0002 {
  public static void main(String[] args) {
    System.out.println(solution(3, 5));
  }

  public static long solution(int a, int b) {
    // a, b 사이의 정수의 합
    // -천만 ~ 천만
    // a,b의 대소관계는 정해져 있지 않다.
    long max = Math.max(a, b);
    long min = Math.min(a, b);
    long sum = 0;
    for (long i = min; i <= max; i++) {
      sum += i;
    }
    return sum;
  }
}

// Math.max() 입력받은 두 인자 값 중 큰 값을 리턴하는 함수
// Math.min() 입력받은 두 인자 값 중 작은 값을 리턴하는 함수
