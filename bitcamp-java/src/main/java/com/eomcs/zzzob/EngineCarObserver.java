package com.eomcs.zzzob;

public class EngineCarObserver extends AbstractObserver {

  @Override
  public void started() {
    System.out.println("시동켠다.");
  }
}
