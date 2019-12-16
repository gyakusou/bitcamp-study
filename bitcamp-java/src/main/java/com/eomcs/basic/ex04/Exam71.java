package com.eomcs.basic.ex04;

public class Exam71 {
  
//인스턴스 필드 (= 인스턴스 변수)
  // new 명령을 실행할 때 준비되는 변수
  int instanceVar; 
  
//클래스 필드 변수 (= 스태틱필드)
   // 클래스가 로딩될 때 준비되는 변수
  static int classVar; 
  
  public static void main(String[] args /* 로컬변수(파라미터) */) {

  //변수의 종류
    
    //로컬변수
    // 메서드를 실행할 때 준비되는 변수
    // =메서드 블록 안에 선언된 변수
    // 메서드 블록을 벗어나서 사용할 수 없다.
    int local; // 로컬변수
    int local2; 
    
    classVar = 200;
    // static 이 안 붙은 인스턴스 변수를 사용할 수 없다.
    // instanceVar = 300; //컴파일 오류
    
    
  }
  
  // 클래스 메서드 = 스태틱 메서드
  static void m1() {
 // 로컬변수
    // 메서드 블록이 다르면 변수도 다르다.
    // 그래서 같은 이름의 변수를 선언할 수 있다.
    int local; 
    
    //다른 메서드 블록에 있는 변수를 사용 할 수 없다.
    // local2 = 100;
    //같은 static 멤버는 사용 할 수 있다.
    classVar = 100; //ok
  }
  
  // 인스턴스 메서드
  void m2() {
    int local; // ok
    
    classVar = 200; // static 멤버 사용 가능.
    instanceVar = 200; //ok static 안 붙은 변수 사용 가능
    
    
    
    
    
    
    
  }
}