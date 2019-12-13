package com.eomcs.basic.ex99;

public class Exam11 {
  public static void main(String[] args) {

    
    // 값 출력하기
    // println() 사용법
    // = 출력 + 줄바꿈
    // 시스템이란 상자 안에 out이라는 도구의 기능 중 하나 println.
    
    System.out.println(100);  // 정수
    System.out.println(3.14); // 부동소수점
    System.out.println(true); // 불린
    System.out.println('가'); // 문자
    System.out.println("안녕!"); // 문자열

    System.out.println(); // 단순 줄 바꿈.

    // print() 사용법
    // = 출력
    System.out.print(100); 
    System.out.print(3.14);
    System.out.print(true);
    System.out.print('가');
    System.out.print("안녕!");

    System.out.print('\n'); // 줄바꿈 표시 이스케이프

    System.out.print("OK!\n"); // 이스케이프 문자는 문자열 안에도 넣을 수 있다.
    System.out.print("NO!");

    // printf() 사용법
    // = printf("형식", 값1 값2 ...) 여러개 지정 가능.
    System.out.printf("\n이름: %s", "홍길동"); // %문자열s
    System.out.printf("\n나이: %d", 20); // %숫자d

    System.out.printf("\n이름(나이): %s(%d)", "홍길동", 20); // 나와있는 순서대로 값 나열

    // 정수 삽입
    // %d : decimal 10진법
    // %x : hexadecimal 16진법
    // %c : character  문자
    System.out.printf("\n %d, %x %c", 65, 65, 65); 

    // ★ 삽입 될 값 지정하기
    // = %값위치$d
    // 값 위치는 1부터 시작
    System.out.printf("\n %1$d, %1$x %1$c", 65); 

    // 논리 값 삽입
    System.out.printf("\n재직자: %s, %b", true, true); // b 불린값 true false
    System.out.printf("\n나이: %s, %d", 20, 20);

    // 출력할 공간 확보
    System.out.printf("\n이름: [%s]", "홍길동");// [홍길동]
    System.out.printf("\n이름: [%20s]", "홍길동"); // 오른쪽 정렬 [                 홍길동]
    System.out.printf("\n이름: [%-20s]", "홍길동"); // 왼쪽 정렬 [홍길동                 ]

    System.out.printf("\n숫자: [%d]", 12345); // [12345]
    System.out.printf("\n숫자: [%10d]", 12345); // 오른쪽 정렬 [     12345]
    System.out.printf("\n숫자: [%-10d]", 12345); // 왼쪽 정렬 [12345     ]

    System.out.printf("\n숫자: [%010d]", 12345); // 빈자리 채워짐 0으로 [0000012345]
    System.out.printf("\n숫자: [%+010d], [%+010d]", 12345, -12345); // [+000012345], [-000012345]

    // 일시 다루기
    java.util.Date today = new java.util.Date();
    today.setDate(9); // 디프리케이티드 

    System.out.printf("\n%s", today); // Thu Dec 12 12:04:43 KST 2019 외국 형식으로 표현
    
    // 날짜 객체에서 년, 월, 일, 시, 분, 초, 요일 추출하기
    System.out.printf("\n%tY, %ty", today, today); // 년도 추출 대문자 소문자에 따라 다르다. / 2019 19
    System.out.printf("\n%tB, %tb", today, today); // 월 추출 대문자 소문자에 따라 다르다. / 12월(December) 12월(Dec)
    System.out.printf("\n%tm", today); // 월 추출 / 12 
    System.out.printf("\n%td, %te", today, today); // 일 추출 / 09, 9
    System.out.printf("\n%tA, %ta", today, today); // 요일 추출 / 월요일(Monday), 월(Mon)
    System.out.printf("\n%tH, %tI", today, today); // 시각 추출 / 24시 12시
    System.out.printf("\n%tM", today); // 분 추출
    System.out.printf("\n%tS, %tL, %tN", today, today, today); // 초 추출 / 초 밀리초 나노초
    System.out.printf("\n%tp, %Tp", today, today); // 오전 오후 / pm, PM

    // 2019-12-12 12:37:45
    System.out.printf("\n%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS", today); //2019-12-09 12:43:18 [% . 1$ .tY] 년도  1$ 삽입
    
    String str;

    str = String.format("\n%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS", today);
    System.out.println(str);


  }
}