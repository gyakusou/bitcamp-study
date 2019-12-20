package com.bitcamp.myproject;

import java.util.Scanner;

public class Switch1 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("[지원부서]");
    System.out.println("1. s/w 개발");
    System.out.println("2. 일반관리");
    System.out.println("3. 시설관리");
    System.out.println("지원분야 번호를 입력하세요?");
    int no = keyboard.nextInt();
    
    System.out.println("제출하실 서류는 다음과 같습니다.");
    switch (no) {
      case 1:
        System.out.println("정보처리자격증");
      case 2:
        System.out.println("졸업증명서");
      case 3:
        System.out.println("이력서");
        break;
        
        default:
          System.out.println("번호를 잘못 입력하셨습니다.");
    }
    
    // no 의 값이 case 에 해당하는 경우 break 명령을 만날때 까지 아래로 실행
    // switch (값) {}
    // 값으로 가능한 데이터 타입 : int정수(byte,short,int,char), 문자열, 특별한상수 enum
    // case 값으로 변수를 사용 할 수 없다. 리터럴만 가능.
    
    // enum 나중에 다시 배운다. 참고는 해야함. 예제는 쓰지 않았다.
    
  }

}
