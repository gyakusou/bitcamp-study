package com.eomcs.basic.ex07x.test;

// GYM 회원 정보를 입력을 받아 출력한다.

public class Test07 {
  public static void main(String[] args) {

    // 회원 정보를 담을 수 있는 메모리의 설계도

    class Member {
      int no;
      String name;
      int birthYear;
      char gender;
      float height;
      float weight;
      boolean personalTraning;
    }

    Member m1; 
    m1 = new Member();
    m1.no = 100;
    
    System.out.println(m1);
    
    Member m2 = m1;
    
    System.out.printf("%d, %d\n", m1.no, m2.no);
    
    m1 = new Member();
    m1.no = 200;
    
    m2 = m1;
    
    System.out.println(m1.no);
    System.out.println(m2.no);
    
    
    // 이제 m2도 같은 인스턴스 주소를 갖고 있다.
    // 같은 인스턴스를 가리킨다.
    // 처음에 만들었던 인스턴스는 주소를 잃어 버려 사용할 수 없다.
    // 주소를 잃어버려 사용 할 수 없는 인스턴스를 "가비지"라 부른다.

  }
}
