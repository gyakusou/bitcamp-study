package com.bitcamp.myproject;

public class If1 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    // if 문 연습
    
    // 기본 공식
    
    // if (조건식 : 반드시 불린(true/false)을 반환 해야 한다)
    // {true 면 실행 }

    int a = 100;
    int b = 200;
    
    if (a < b) {
      System.out.println("o"); // true 이므로 출력 된다.
    }
    
    if (a > b) {
      System.out.println("p"); // false 이므로 출력 되지 않는다.
    }
    
    if (a > b) {
      System.out.println("o");
    } else if (a < b) {
      System.out.println("x");
    } 
    
    // if 가 참이라면 o를 그러나 false 라면 x를 출력.  이 경우에는 false 이기 때문에 x 값 출력.
    
    
  }

}
