package com.eomcs.zzzob;

import java.util.ArrayList;
import java.util.List;

public class Car {

  List<CarObserver> observers = new ArrayList<>();

  void addCarObserver(CarObserver observer) {
    observers.add(observer);

  }

  void removeCarObserver(CarObserver observer) {
    observers.remove(observer);

  }

  void start() {
    System.out.println("시동을 킨다");
    System.out.println("전조등을 킨다");
  }

  void stop() {
    System.out.println("선루프를 닫는다.");
  }

}
