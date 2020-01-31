package com.eomcs.design_pattern.observer.after.h;

// 이전 버전에서는 인터페이스를 직접 구현했지만
// (그래서 관심도 없는 carStopped() 메서드 까지 정의했다)
// 이번 버전에서는 추상 클래스를 상속받아 간접적으로 구현한다.
public class LightOffCarObserver extends AbstractCarObserver {

  @Override
  public void carStopped() {
    System.out.println("전조등을 끈다.");
  }

  // carStarted()구현하지 않았네요?
  // - 수퍼클래스에서 구현했습니다.
  // - 물론 빈 코드를 가진 메서드이죠
}
