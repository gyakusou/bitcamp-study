# 54_3 - Apache HttpComponents 라이브러리를 이용하여 웹서버 구축하기

## 학습목표

- Apache HttpComponents 라이브러리를 사용할 수 있다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/ServerApp.java 변경

## 실습  

### 훈련1: Apache HttpComponents 라이브러리를 프로젝트에 적용한다.

- search.maven.org 에서 라이브러리 정보 알아낸다.
  - 'httpclient5' 로 검색한다.
- build.gradle 변경
  - 의존 라이브러리르 추가한다.
- 'gradle eclipse' 실행
  - 이클립스 설정 파일을 갱신한다.
- 이클립스에서 프로젝트 refresh 한다.

### 훈련2: HTTP 요청을 받을 때 HttpComponents 라이브러리에 있는 클래스를 사용한다.

- com.eomcs.lms.ServerApp 변경



### 훈련3: 웹브라우저가 보낸 데이터 받기

- com.eomcs.lms.ServerApp 변경
  - request-uri에서 자원의 경로와 데이터를 분리한다.
  - 예) /board/add?title=aaaa
  - 자원의 경로: /board/add
  - 데이터: title=aaaa

### 훈련4: 웹브라우저가 보낸 게시글 데이터 저장하기

- com.eomcs.lms.servlet.BoardAddServlet 변경
  - 웹브라우저가 보낸 게시글을 입력한다.
  - 웹브라우저에게 게시글 입력 결과를 보낸다.

### 훈련5: 게시글 상세 정보를 출력하기

- com.eomcs.lms.servlet.BoardDetailServlet 변경
  - 웹브라우저가 보낸 번호의 게시글을 가져온다.
  - 웹브라우저에게 게시글 상세 정보를 HTML 형식으로 만들어 보낸다.
- com.eomcs.lms.servlet.BoardListServlet 변경
  - /board/detail 을 요청하는 링크를 추가한다.  
  
### 훈련6: 게시글 삭제하기

- com.eomcs.lms.servlet.BoardDeleteServlet 변경
  - 웹브라우저가 보낸 번호의 게시글을 삭제한다.
  - 웹브라우저에게 게시글 삭제 결과를 HTML 형식으로 만들어 보낸다.
- com.eomcs.lms.servlet.BoardDetailServlet 변경
  - /board/delete 을 요청하는 링크를 추가한다.
  
### 훈련7: 게시글 변경폼 만들기

- com.eomcs.lms.servlet.BoardDetailServlet 변경
  - /board/updateForm 을 요청하는 링크를 추가한다.
- com.eomcs.lms.servlet.BoardUpdateFormServlet 추가
  - 웹브라우저에게 게시글 데이터 변경을 요구하는 HTML을 보낸다.

### 훈련8: 게시글 변경하기

- com.eomcs.lms.servlet.BoardUpdateServlet 변경
  - 웹브라우저가 보낸 게시글을 변경한다.
  - 웹브라우저에게 게시글 변경 결과를 보낸다.
  
### 훈련9: 회원 관리 서블릿을 모두 변경하기

- com.eomcs.lms.dao.MemberDao 변경
  - default 메서드를 추상 메서드로 전환한다.
- com.eomcs.lms.servlet.MemberAddFormServlet 추가
- com.eomcs.lms.servlet.MemberXxxServlet 변경
- com.eomcs.lms.ServerApp 변경

### 훈련10: 수업 관리 서블릿을 모두 변경하기

- com.eomcs.lms.dao.LessonDao 변경
  - default 메서드를 추상 메서드로 전환한다.
- com.eomcs.lms.servlet.LessonAddFormServlet 추가
- com.eomcs.lms.servlet.LessonXxxServlet 변경

### 훈련11: 사진게시글 관리 서블릿을 모두 변경하기

- com.eomcs.lms.servlet.PhotoBoardAddFormServlet 추가
- com.eomcs.lms.servlet.PhotoBoardXxxServlet 변경

### 훈련12: 로그인 서블릿을 모두 변경하기
  
- com.eomcs.lms.servlet.LoginFormServlet 추가
- com.eomcs.lms.servlet.LoginServlet 변경