package com.eomcs.oop.ex02.study;

public class GasStation {
   String name;
   int type;
  
   /*static*/ int refuel(Car c) { // 인스턴스 필드를 사용하기 때문에 static 사용하지 않는다.
    if (c.type != this.type)
      return 0;
    int amount = 100 - c.energy;
    c.energy = 100;
    return amount;
  }
  
  static void clean(Car c) { // 인스턴스 필드를 사용하지 않기 때문에 static 사용
    c.cleanLevel = 0;
  }
}
