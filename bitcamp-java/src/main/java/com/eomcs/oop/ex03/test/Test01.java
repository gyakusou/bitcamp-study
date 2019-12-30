package com.eomcs.oop.ex03.test;

class Score {
  static int count; // 공통 사용은 스태틱 변수에
  
  String name; // 각각 사용은 인스턴스 변수에
  int kor;
  int eng;
  int math;
  int sum;
  float aver;
  
  Score(String name, int kor, int eng, int math) { 
    System.out.println("Score() - 2");
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.compute();
    Score.increase();
    
  }
  
  static void increase() {
    Score.count++;
  }
  
   void compute() { // 연산자.
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }
   
   //static void compute(Score s) {
   // s.sum = s.kor + s.eng + s.math;
   // s.aver = s.sum / 3f;
   // }
}

public class Test01 {
  public static void main(String[] args) {

    Score s1 = new Score("홍길동", 100, 90, 80); // 인스턴스 변수는 new로 실행 가능.
    System.out.println("-------------------------------------------");

    
    Score s2 = new Score("임꺽정", 90, 80, 70); // 인스턴스 변수는 new로 실행 가능.
    System.out.println("--------------------------------------------");
    
  
    
  }
}
