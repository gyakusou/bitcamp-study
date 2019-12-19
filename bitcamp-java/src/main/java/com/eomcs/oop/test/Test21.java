package com.eomcs.oop.test;

// GYM 회원 정보를 입력을 받아 출력한다.
// 회원 정보를 담을 수 있는 메모리의 설계도

public class Test21 {
  static class Member {
    int no;
    String name;
    int birthYear;
    char gender;
    float height;
    float weight;
    boolean personalTraning;
  }
  
  public static void main(String[] args) {
    // 인스턴스 주소 주고 받기
    
    // 1. 인스턴스 주소 받기
    Member m1;
    m1 = createMember();
    
    // 2. 인스턴스에 주소 넘기기
    setMembervalues(m1);
    
    // 3. 출력
    printMember(m1);
    
  }
    
  static Member createMember() {
    Member m = new Member();
    return m;
  }
  
  static void setMembervalues(Member m) {
    m.no = 100;
    m.name = "홍길동";
    m.birthYear = 2000;
    
    
  }
  static void printMember(Member m) {
    System.out.println(m.no);
    System.out.println(m.name);
    System.out.println(m.birthYear);
    
  }
  
}
  

