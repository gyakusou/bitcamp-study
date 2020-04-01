# 55_2 - 이클립스 웹 프로젝트로 전환하기

## 학습목표

- gradle 설정을 통해 이클립스 웹 프로젝트로 전환할 수 있다.

## 실습 소스 및 결과

- build.gradle 변경

## 실습  

### 훈련1: 이클립스에 톰캣 서버 환경을 추가한다.

- Window 메뉴/Preferences/Server/Runtime Environment 설정추가

### 훈련2: 웹 애플리케이션 테스트 서버 구축

- Servers 뷰/New Server
  
### 훈련3: 웹 프로젝트로 전환

- build.gradle 변경
  - 'eclipse' 플러그인 대신에 'eclipse-wtp' 플러그인 추가
  - 'war' 플러그인 추가 
 
 
 