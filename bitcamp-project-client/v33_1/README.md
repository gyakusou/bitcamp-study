# 33_1 - 서버의 'Stateless' 통신 방식에 맞춰 클라이언트 변경하기

## 학습목표

- 'Stateful' 을 `Stateless` 통신 방식으로 전환하기
- `Stateless` 통신 방식의 특징과 장단점 이해하기

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/ClientApp.java 변경

## 실습  

### 훈련 1: 훈련 1: 'Stateful' 통신 방식을 `Stateless`로 바꿔라.

- com.eomcs.lms.ClientApp을 변경한다.
  - 한 번 연결에 요청/응답을 한번만 수행한다.
