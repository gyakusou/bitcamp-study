build.gradle 변경

implementation group: 'com.google.code.gson', name: 'gson', version: '2.8.6'


# 28_4 - 파일 입출력 시에 버퍼 기능 추가하기 

## 학습 목표 

- 데코레이터 디자인 패턴을 이해한다.
- 파일 입출력 클래스에 다른 클래스를 붙여 기능을 확장할 수 있다.
- 버퍼 기능을 수행하는 입출력 클래스에 동작 원리를 이해한다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/App.java 변경
  
## 실습  

### 훈련 1: 입출력에 버퍼 기능을 추가한다.

- App.java
  - saveBoardData() 메서드 변경한다. 
  - loadBoardData() 메서드 변경한다.
  - saveMemberData() 메서드 변경한다.
  - loadMemberData() 메서드 변경한다.
  - saveLessonData() 메서드 변경한다.
  - loadLessonData() 메서드 변경한다.
  