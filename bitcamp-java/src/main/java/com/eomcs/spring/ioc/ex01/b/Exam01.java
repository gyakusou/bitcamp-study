// 스프링 IoC 컨테이너 사용
package com.eomcs.spring.ioc.ex01.b;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Exam01 {
  public static void main(String[] args) {

    // 2) 운영체제의 파일 시스템에서 설정 파일을 찾는 IoC 컨테이너
    // => 설정 파일 경로를 지정할 때 직접 파일 경로를 지정해야 한다.
    // => 주의!
    // 설정 파일 경로를 지정할 때 URL 형식으로 지정해야 한다.
    // URL 형식에서는 파일 시스템을 가리킬 때 다음의 접두어를 붙인다.
    // file://
    ApplicationContext iocContainer2 = new FileSystemXmlApplicationContext(
        "file:///Users/eomjinyoung/git/bitcamp-java-2018-12/java-basic/bin/main/ch29/a/application-context.xml");

    // 3) 자바 클래스 파일의 애노테이션으로부터 설정 정보를 추출한다. = java config 라 부른다.
    // => 생성자에 설정 정보를 갖고 있는 클래스의 타입 정보를 넘긴다.
    ApplicationContext iocContainer3 = new AnnotationConfigApplicationContext(AppConfig.class);

    System.out.println("실행 완료!");
  }
}


