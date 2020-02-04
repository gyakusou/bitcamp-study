# v32_4 - 게시물 관리와 관련하여 클라이언트 요청을 처리하기

## 학습목표

- 데이터 파일을 읽고 쓸 수 있다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/domain 패키지 생성
- src/main/java/com/eomcs/lms/domain/Board.java 추가
- src/main/java/com/eomcs/lms/domain/Lesson.java 추가
- src/main/java/com/eomcs/lms/domain/Member.java 추가
- src/main/java/com/eomcs/lms/context 패키지 생성
- src/main/java/com/eomcs/lms/context/ApplicationContextListener.java 추가
- src/main/java/com/eomcs/lms/DataLoaderListener.java 추가
- src/main/java/com/eomcs/lms/ServerApp.java 변경

## 실습  

### 훈련 1: v31 프로젝트에서 데이터를 저장하고 로딩하는 코드를 가져온다.

- com.eomcs.lms.damain 패키지를 생성한다.
- com.eomcs.lms.domain.* 클래스를 가져온다.
- com.eomcs.lms.context 패키지를 생성한다.
- com.eomcs.lms.context.ApplicationContextListener 를 가져온다.
- com.eomcs.lms.DataLoaderListener 를 가져온다.
- ServerApp.java 변경
  - 옵저버를 등록하고 호출하는 코드를 적용한다.

