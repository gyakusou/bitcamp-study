package com.eomcs.oop.ex06.c;

public class X4 extends X3 {
    @Override
    void m1() {
        System.out.println("X4의 m1()");
    }
    
    void test() { // this 현재 클래스 에서부터 찾아 올라가라, super 수퍼 클래스 부터 찾아 올라가라
        this.m1(); // X4의 m1()
        super.m1(); // X2의 m1()
        
        this.m2(); // X3의 m2()
        super.m2(); // X3의 m2()

        //super.super.m1(); // 컴파일 오류! 이런 문법은 없다! 무협지 문법!
    
    }
}





