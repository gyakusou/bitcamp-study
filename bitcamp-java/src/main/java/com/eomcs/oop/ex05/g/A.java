package com.eomcs.oop.ex05.g;

public class A /*extends Object*/ {
    int v1;
    
    // A 클래스는 기본 생성자가 없다.
    // => int 값을 받는 생성자만 있다.
    // 
    A(int value) { // 파라미터가 없는 생성자 => 기본생성자 ex. A() 이 경우에는 기본생성자가 아니기 때문에 sub에서 값을 지정해야 한다.
        this.v1 = value;
        System.out.println("A(int) 생성자!");
    }
}


