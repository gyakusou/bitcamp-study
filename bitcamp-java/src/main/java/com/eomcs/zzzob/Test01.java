package com.eomcs.zzzob;

public class Test01 {
  public static void main(String[] args) {
    Car car = new Car();

    car.addCarObserver(new EngineCarObserver()); /////////////////////// ??

    System.out.println("---next---");

    car.start();

    System.out.println("---next---");

    car.stop();
  }
}
