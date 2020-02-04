package com.eomcs.zzzob;

public class LightonCarObserver extends AbstractObserver {

  @Override
  public void started() {
    System.out.println("전조등켠다");
  }

}
