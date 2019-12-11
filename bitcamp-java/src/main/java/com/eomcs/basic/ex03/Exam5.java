package com.eomcs.basic.ex03;

// 논리 리터럴

public class Exam5 {

  public static void main(String[] args) {
    
    // 참 : true
    // 거짓 : flase
    // - 자바는 대소문자 구분하여 처리한다.

    System.out.println(true);
    System.out.println(false);
    //System.out.println(TRUE); // 컴파일 오류 
    //대소문자 구분, 자바에서는 소문자로 적어야 처리한다.

    /* 보통 비교 연산의 결과로 논리 값이 리턴된다. */
    System.out.println(4 < 5);
    System.out.println(4 > 5);
    
    /*논리 연산의 결과도 논리 값이다. */
    System.out.println(true && true);
    System.out.println(true && false); // 오른쪽 확인

    System.out.println(false && true); // 오른쪽 값 없이 거짓이 되어 실행 x
    System.out.println(false && false);

    System.out.println(true || true); // 왼쪽 참이기 떄문에 오른쪽 값 상관없이 넘어간다.
    System.out.println(false || true); // 오른쪽 확인

    /*
    1. true || alert(); 에서는 왼쪽이 이미 참이기 때문에 
    오른쪽 값을 확인하지 않고 넘어가버립니다.

    2. false || alert(); 에서는 왼쪽이 거짓이기 때문에 오른쪽 값을 확인합니다. 
    따라서 alert() 함수가 실행됩니다.

    3. true && alert(); 에서는 왼쪽이 참이기 때문에 오른쪽을 확인합니다.
    (and 연산은 둘 다 참이어야 실행됩니다.) 따라서 alert() 함수가 실행됩니다.

    4. false && alert(); 에서는 왼쪽이 이미 거짓이기 때문에 
    오른쪽을 볼 것도 없이 이미 이 연산은 거짓이 되어 실행되지 않습니다.
    */





    /*
    문자 코드와 '' 연산 
    '문자' 단독으로 사용될 때는 문자로취급하지만, 
    다른 값과 연산을 수행하면 해당 문자코드는 정수로 간주한다.
    */
    System.out.println('가' == 44032); // true
    System.out.println('가' == 44033); // false


    System.out.println('가' + 44032); // 88064
    /* 문자코드는 연산시 정수로 간주하기 때문에 가의 고유 값인 44032 + 44032
    로 연산이 된다.  */
  }
}

/*
논리 값을 다룰 때 메모리 크기
JVM은 논리 값을 저장 할 때 4바이트 정수 메모리를 사용한다.
true 는 (1) , false (0) 을 저장한다.  
배열인 경우 1바이트 정수 배열의 메모리를 사용한다.*/