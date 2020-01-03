// 오버라이딩(overriding)
package com.eomcs.oop.ex06.c;

public class A {
    String name; //인스턴스필드
    
    void print() { // print 메서드 (name 값 출력)
        System.out.printf("'%s'님 반갑습니다.\n", this.name);
    }
}
