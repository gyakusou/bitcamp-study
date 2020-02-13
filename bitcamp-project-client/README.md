# 33_3 - 리팩토링 : 서버 연결 부분을 캡슐화하기

## 학습목표

- 리팩토링의 목적을 이행한다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/dao/porxy/Worker.java 추가
- src/main/java/com/eomcs/lms/dao/porxy/DaoProxyHelper.java 추가 
- src/main/java/com/eomcs/lms/dao/porxy/XxxDaoProxy.java 변경
- src/main/java/com/eomcs/lms/ClientApp.java 변경

## 실습  

### 훈련 1: 프록시 생성 부분을 변경한다.

- com.eomcs.lms.dao.proxy.XxxDaoProxy  변경한다.
  - 요청할 때 서버에 연결한다.