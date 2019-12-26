package com.eomcs.oop.ex02.study;

public class Test01 {
  public static void main(String[] args) {
    
    Score s = new Score();
    
    s.name = "홍길동";
    s.kor = 100;
    s.eng = 90;
    s.math = 80;
    
   s.calculate(); // calculate = operator "연산자" "메서드", s = operand
   
   
   
   System.out.println(s.sum);
   System.out.println(s.aver);
   
   // int i = 100;
   // i++;
   // i = operand "피연산자", ++ = operator "연산자"
  }
}
