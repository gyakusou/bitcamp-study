package com.eomcs.al;

public class test0003 {
  public static void main(String[] args) {
    System.out.println(solution("abcde"));
  }

  public static String solution(String s) {
    // 가운데 글자를 리턴하는 함수
    // 단어의 길이가 짝수면, 가운데 두글자 반환
    // - abcdef 의 길이 : 6 // cd
    // 단어의 길이가 홀수면 가운데 한글자 반환
    // - abcde 의 길이 : 5 // c

    int slen = s.length(); // 6
    if (slen % 2 == 1) // 6%2 == 0
      return s.charAt(slen / 2) + "";
    return s.substring(slen / 2 - 1, slen / 2 + 1); // (2, 4)


  }
}

// substring() 문자열에서 특정 부분만 골라낼 때 사용하는 메서드
