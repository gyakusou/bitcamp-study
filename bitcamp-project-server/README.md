# 58_2 - Page Controller를 POJO로 전환하고 Spring IoC 컨테이너에서 관리하기

## 학습목표

- 

## 실습 소스 및 결과

- - src/main/webapp/**/*.jsp 변경

## 실습  

### 훈련1: 페이지 컨트롤러를 다룰때 사용할 애노테이션과 클래스를 준비한다.

- com.eomcs.util.RequestMapping 애노테이션 추가
  - 클라이언트 요청에 대해 호출되는 메서드에 붙이는 애노테이션이다.

- com.eomcs.util.RequestHandler 클래스 추가
  - 호출될 객체와 메서드 정보를 담는다.

- com.eomcs.util.RequestMappingHandlerMapping 클래스 추가
  - 요청 URL에 대한 RequestHandler를 관리한다.

### 훈련2: 페이지 컨트롤러의 객체에서 request handler 정보를 추출하여 보관한다.

- com.eomcs.lms.ContextLoaderListener 변경
  - Spring IoC 컨테이너에서 관리하는 객체 중에서
    @RequestMapping 애노테이션이 붙은 메서드를 찾아서
    RequestMappingHandlerMapping 객체에 보관한다.
    
### 훈련3: 프론트 컨트롤러는 RequestMappingHandlerMapping에서 메서드를 찾아 호출한다.

-  com.eomcs.lms.servlet.DispatcherServlet 변경
  - 클라이언트 요청이 들어오면, 그 경로에 해당하는 request handler를 찾아 호출한다.
  




















