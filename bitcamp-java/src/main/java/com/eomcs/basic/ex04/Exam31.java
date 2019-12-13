package com.eomcs.basic.ex04;


public class Exam31 {
  public static void main(String[] args) {

    // 부동소수점 변수 - 메모리 크기

    float f;

    f = 3.141592f; // 부동소수점의 경우 기본 8비트 이기 때문에 f이라믄 변수를 쓰려면 f 붙여야 한다.
    System.out.println(f);

    f = 3.1415929f; // 값이 틀어진다. 유효자리수 7자리 이상.
    System.out.println(f); 

    f = 0.0000003141592f; // 0은 자리 수로 치지 않는다.
    System.out.println(f); 

    f = 0.0000003141592929f; // 값이 틀어진다. 소수점 이하인 경우 앞의 0 제거 앞의 0은 유효자리 수에 포함
    System.out.println(f); 

    f = 314159200000.0f; // 값이 틀어진다. 소수점 이상인 경우 뒤의 0을 포함하여 유효자리수 계산
    System.out.println(f); 

    double d;

    d = 9.87654321234567;
    System.out.println(d);

    d = 98765432123456.7;
    System.out.println(d);

    d = 98765432123456.74; // 값이 틀어진다. 
    System.out.println(d);

    // 변수와 리터럴
    f = 99999.8f;
    System.out.println(f);

    f = 99999.88777f; // 이미 리터럴이 4바이트 유효 자리수를 넘어갔다.
    System.out.println(f);

    d = 99999.88f; //4바이트 부동소수점을 8바이트 부동 소수점에 넣었다. / 99999.8828125
    System.out.println(d);

    d = 99999.88; // 8바이트 부동소수점을 8바이트 부동 소수점에 넣었다. / 99999.88
    System.out.println(d);

    // 리터럴을 사용할때 4바이트는 7자리 8바이트는 15자리 안넘어가게
    // 4바이트 메모리는 4바이트 리터럴 8바이트 메모리는 8바이트 리터럴 사용한다.

    // 정수는 작은바이트를 큰 변수에 넣을때는 괜찮으나, 부동소수점의 경우에는 다르다. 

    float f1 = 99988.88f;
    float f2 = 11.11111f;

    System.out.println(f1);
    System.out.println(f2);

    float f3 = f1 + f2;
    System.out.println(f3); // 각각 float 의 유효소수점이더라도 계산할때는 유효소수점 자리가 넘어 갈 수 있기 때문에 double 을 기본으로 사용.
    // 99988.88
    //    11.11111
    //--------------
    // 99999.99111

    double r = f1 + f2; // float + float = float 이미 결과에서 값이 왜곡된다.
    System.out.println(r);

    // 해결책 부동소소점을 더블을 기본으로 쓴다. 계산의 경우는 더블을 추천한다.

    double d1 = 99988.88;
    double d2 = 11.11111;

    System.out.println(d1);
    System.out.println(d2);

    double d3 = d1 + d2;
    System.out.println(d3);

    f1 = 3.141592f;
    d1 = f1; // 컴파일 ok 값은 왜곡될 수 있다!!!! 정수와 다르다. short 나 byte를 long에 넣어도 왜곡 없으나 부동소수점은 왜곡 나타난다.
    System.out.println(d1);

    // f1 = d1; // 컴파일 오류


  }
}