package com.eomcs.basic.ex06x.assignment;

import java.util.Scanner;

public class Console {

  @Deprecated //비난 받는 메소드/ 애노테이션/ 컴파일러에게 메소드를 재정의함을 알리는 명령어.
  static int inputInt() {
    return inputInt("밑변 길이? ");
  }
    
  static int inputInt(String message) {
    Scanner keyScan = new Scanner(System.in);
    System.out.print(message);
    int width = keyScan.nextInt();
    //keyScan.close();
    return width;
  }
}
