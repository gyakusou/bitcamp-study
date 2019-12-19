package com.eomcs.oop.test;

// GYM 회원 정보를 입력을 받아 출력한다.

public class Test04 {
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
    System.out.println(m1); // 인스턴스에 부여된 고유 번호와 클래스 명이 출력된다.
    System.out.println(m1.no);

    // 레퍼런스의 주소를 없애는 방법
    m1 = null; // 주소가 없다는 의미로실제 메모리에 0으로 설정된다.
    System.out.println(m1);
    System.out.println(m1.no);


  }
}
