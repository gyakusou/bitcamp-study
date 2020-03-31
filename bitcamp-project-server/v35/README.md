# 35 - 스레드풀을 이용하여 스레드를 재사용하기

## 학습목표 

- 'Flyweight' 디자인 패턴의 용도를 이해한다.
- 'Flyweight' 디자인 패턴의 응용 기법인 Pooling 기법의 동작 원리를 이해한다.
- Pooling 기법을 사용하여 객체를 재활용 할 수 있다.
- Thread 를 종료 시키지 않고 계속 사용할 수 있다.
- Thread 의 wait()/noitfy()의 사용법을 이해한다.
- Thraed Pool을 적용할 수 있다.

## 실습 소스

- src/main/java/com/eomcs/lms/ServerApp.java 변경

### 훈련 1: 스레드 풀을 적용하여 스레드를 관리하라.

- com.eomcs.lms.ServerApp.java 변경한다.
  - 스레드 풀을 준비한다.
  - 스레드를 생성할 때 스레드 풀을 사용한다.