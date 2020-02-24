# 37_4 - Application Server 구조로 변경: 검색 기능 추가 

## 학습목표

- Application Server 아키텍처의 구성과 특징을 이해한다.
- 통신 프로토콜 규칙에 따라 동작하는 서버를 만들 수 있다.
- 새 기능을 추가하더라도 클라이언트 앱을 재 배포할 필요가 없음을 이해한다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/dao/MemberDao.java 변경
- src/main/java/com/eomcs/lms/dao/mariadb/MemberDaoImpl.java 변경
- src/main/java/com/eomcs/lms/servlet/MemberSearchServlet.java 추가
- src/main/java/com/eomcs/lms/ServerApp.java 변경

## 실습  

### 훈련1: 회원 검색 기능을 추가하라.

서버에서 애플리케이션을 실행하는 방식의 이점은 새 기능을 추가하더라도 사용자 PC에 클라이언트 프로그램을 재설치 할 필요가 없다는 것이다. 검색 기능을 추가한 후 이를 확인한다.

- MemberDao.java
    - 회원 검색 결과를 DB에서 가져오는 메서드 `search()`를 추가한다.
- MemberSearchCommand.java
    - 회원 검색 처리를 수행하는 클래스를 추가한다.
    
    
    
    
    
    
    
    
    
    