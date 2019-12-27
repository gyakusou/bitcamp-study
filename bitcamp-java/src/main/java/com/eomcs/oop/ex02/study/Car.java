package com.eomcs.oop.ex02.study;

// 인스턴스 필드
public class Car { // 자동차 정보를 한대만 저장시 static (class당 하나) / 여러대 개별적 관리시 static 제외
  
  public static final int OIL = 1; // final 변수는 public static final로 사용한다. 값이 중복되기 때문.
  public static final int GAS = 2;
  
  String name;
  int type;
  String color;
  int speed;
  int energy;
  int power;
  int cleanLevel;
  
   void speedUp() {
    //Car this = 메소드를 호출할 때 넘겨준 인스턴스 주소
     if (this.speed >= 100) 
      return; // 조건완료시 더이상 작동 하지 않는다.
      this.speed += 10;
  }
  
   int comparePower(Car c) {
    if (this.power > c.power)
      return -1;
    else if (this.power == c.power)
      return 0;
    else
      return 1;
    
  }
}
