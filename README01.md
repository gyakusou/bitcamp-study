primitive data type

정수: byte ,short, int, long
부동소수점: float, double
논리: boolean
문자: char

그 외 데이터 타입은 "사용자 정의 데이터 타입" class 라는 문법으로 처리.
                          ------- 언어 (개발자)

class 데이터타입 {
데이터 변수선언 
}

ex. class Member {
int no;
String name;
String email;
boolean working;
}

새로운 회원 정보를 구성. 

new Member();
      --------- 데이터 타입명

ㅁ ㅁ   ㅁ    ㅁ
no name email working..

메모리를 만들고 메모리를 담을 변수가 필요하다.
변수 명 앞에 어떤 데이터를 다룰지 클래스명을 붙인다.

Member m = new Member(); 
// 사용자정의데이터 타입을 사용하려면 반드시 new 명령어 써야한다.

ㅁ      = ㅁ ㅁ   ㅁ    ㅁ
100번지   no name email working..

m (레퍼런스)

-----------------------------------------------------------------------------



