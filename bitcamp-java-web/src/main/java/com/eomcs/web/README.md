1. local에 폴더 생성 (bitcamp-java-web)
- C:\Users\user\git\bitcamp-study\bitcamp-java-web

2. powershell 에서 프로젝트 폴더 들어간 후 gradle init

3. visual studio 에서 build.gradle 설정

4. visual studio 에서 src/main 하위 폴더 webapp 만들고 index.html 파일 만들기
<!DOCTYPE html>
<html>
<head>
  <meta charset='utf-8'>
  <meta http-equiv='X-UA-Compatible' content='IE=edge'>
  <title>Page Title</title>
  <meta name='viewport' content='width=device-width, initial-scale=1'>
  <link rel='stylesheet' type='text/css' media='screen' href='main.css'>
  <script src='main.js'></script>
</head>
<body>
  <h1>비트캠프 서블릿 프로그래밍 예제</h1>
</body>
</html>

<html 쓰고 crtl+space bar -> <body> 안에 -> <h1>예시문장</h1>

5. bitcamp-java-web 폴더 클릭후 -> servers 들어가서 서버추가
new -> server -> tomcat v9.0 server -> "서버 명 정하고" -> next -> 해당 프로젝트 폴더 선택 후 finish

6. 서버 시작 후 tomcat 서버 접속
localhost:9999/bitcamp-java-web -> 예시문장 나오면 성공!