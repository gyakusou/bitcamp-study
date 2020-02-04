package com.eomcs.zzzob;

public class SunroofCloseCarObserver extends AbstractObserver {

  @Override
  public void stopped() {
    System.out.println("선루프 닫는다.");
  }

}
