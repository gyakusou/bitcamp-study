package com.eomcs.al;

// 자릿수 더하기

public class test0006 {
  public static void main(String[] args) {
    System.out.println(solution(12345));

  }

  public static int solution(int n) {
    //
    // 12345 / 10000 = 1, 12345%10000 = 2345
    int bound = 10000;
    int result = 0;
    while (n > 0) { // 12345
      if ((n / bound) > 0) { // 12345/10000=1 > 0
        result += (n / bound); // result += 1
        n %= bound; // n = 2345
      }
      bound /= 10; // 1000

    }
    return result;

  }
}



// String value = String.valueOf(n);
// int result = 0;
// for (int i = 0; i < value.length(); i++) {
// char ch = value.charAt(i);
// result += (ch - 48); //
// }
// return result;
