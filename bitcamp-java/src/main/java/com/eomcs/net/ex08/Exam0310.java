// Apache HttpComponent 사용 - HttpGet 클래스
package com.eomcs.net.ex08;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


// https://mvnrepository.com/
// 검색 Apache HttpClient
// 최신버전 compile group~ 복사
// 해당 프로젝트 build.gradle 에 dependencies에 붙여넣기
// compile group -> implementation group 으로 변경 저장
// 파워쉘
// 해당 프로젝트로 들어가서 gradle cleanEclipse 수행 후 gradle eclipse 수행
// 이클립스에서 리프레쉬

public class Exam0310 {

  public static void main(String[] args) throws Exception {

    // HTTP 프로토콜을 좀 더 정밀하게 제어하고 싶다면
    // Apache의 HttpClient 라이브러리를 사용하라.
    //
    // => HttpClient, HttpGet 등 클래스가 있다.
    // => www.apache.org 사이트에서 제공하는 HttpComponent 라이브러리에 들어 있는 클래스이다.
    // => 사용하려면 먼저 외부 라이브러리를 프로젝트로 가져와야 한다.
    // 1) mvnrepository.com 에서 apache httpclient 키워드로 검색한다.
    // 2) 최신 라이브러리 정보를 build.gradle의 dependencies {} 블록에 추가한다.
    // 3) 콘솔에서 "gradle eclipse"를 실행하여 .classpath 파일을 갱신한다.
    // 이때 외부 라이브러리를 자동으로 다운로드 받을 것이다.
    // 4) 이클립스 에디터에서 해당 프로젝트를 리프래시 한다.
    // 5) 이클립스의 프로젝트에서 해당 라이브러리가 추가되었는지 확인하라!

    // => HTTP 요청을 수행할 객체를 준비한다.
    CloseableHttpClient httpClient = HttpClients.createDefault();

    // => HTTP GET 요청 정보를 준비한다.
    HttpGet get = new HttpGet("https://www.daum.net");

    // => HttpClient 객체를 사용하여 GET 요청을 실행한다.
    // => 리턴 값은 웹 서버의 응답 데이터를 다루는 도구이다.
    CloseableHttpResponse response = httpClient.execute(get);

    // => 응답 도구를 이용하여 서버가 보낸 데이터를 꺼낸다.
    HttpEntity entity = response.getEntity();

    if (entity != null) {
      // => HttpEntity 객체에 들어 있는 값을 문자열로 변환하여 출력한다.
      System.out.printf("응답 데이터 크기 => %d\n", entity.getContentLength());
      System.out.printf("응답 데이터의 타입 => %s\n", entity.getContentType());

      System.out.println("---------------------------------");

      // HttpEntity에 들어 있는 서버 응답 데이터를 꺼내려면 getContent()를 사용해야 한다.
      // getContent()의 리턴 값은 InputStream 객체이다.
      // InputStream을 가지고 데이터를 읽으려면 입출력 코딩을 작성해야 한다.
      // => 이 부분을 대신 해주는 도우미 클래스가 있다.
      String content = EntityUtils.toString(entity);
      System.out.println(content);
    }
  }

}


