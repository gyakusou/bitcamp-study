package com.eomcs.al;

public class test0001 {
  public static void main(String[] args) {
    System.out.println(solution("pPooyy"));
  }

  public static boolean solution(String s) {
    // 50자 이하의 영문자로 이루어진 문자열
    // true -> p랑 y의 개수가 같을때, 둘다 없을때
    // false -> 다를때
    // 대소문자 구분 x
    s = s.toLowerCase();
    int pNum = 0;
    int yNum = 0;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'p')
        pNum++;
      if (s.charAt(i) == 'y')
        yNum++;
    }
    return pNum == yNum;

  }
}

// string.toLowerCase() 문자열을 소문자로 변환해서 반환
// string.toUppderCase() 문자열을 대문자로 변환해서 반환
// charAt(index) 문자열에서 인자로 주어진 값에 해당하는 문자를 리턴한다. / index - 필수, 0보다 큰 정수
