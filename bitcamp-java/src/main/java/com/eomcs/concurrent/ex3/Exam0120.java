// Thread를 상속 받기 - 익명 클래스로 구현하기
package com.eomcs.concurrent.ex3;

public class Exam0120 {

  public static void main(String[] args) {

    System.out.println("스레드 실행 전");

    // 익명클래스

    new Thread() {

      @Override
      public void run() {
        for (int i = 0; i < 1000; i++) {
          System.out.println("===> " + i);
        }
      }
    }.start();

    for (int i = 0; i < 1000; i++) {
      System.out.println(">>>> " + i);
    }

    System.out.println("스레드 실행 후");

  }

}

