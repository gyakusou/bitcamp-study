package com.eomcs.basic.ex03;

// 정수 리터럴 _

public class Exam22 {
  public static void main(String[] args) {
    
    // 10진수 리터럴이다. //_ 언더바는 자리수
    
    System.out.println(2_3500_0000); //우리나라 수는 4자리 마다 끊기
    System.out.println(235_000_000); // 서양의 수는 3자리 마다 끊기
    System.out.println(23_5_00_00_00);
    // System.out.println(_2_3500_0000); 앞자리 언더바 안됀다.
    // System.out.println(2_3500_0000_); 뒷자리 언더바 안됀다.
    
    // 8진수 리터럴 
    System.out.println(01_44);
    System.out.println(0_144);
    // System.out.println(0144_); 언더바 안됀다.
    //System.out.println(_01_44); 언더바 안됀다.

    // 2진수 리터럴 0b
    System.out.println(0b0110_0100);
    // System.out.println(0b_01100100); 언더바 안됀다.
    // System.out.println(0b01100100_); 언더바 안됀다.
    // System.out.println(_0b01100100); 언더바 안됀다.

    // 16진수 리터럴 0x
    System.out.println(0x00_64);
    // System.out.println(0x_0064); 언더바 안됀다.
    // System.out.println(0x0064_); 언더바 안됀다.
    //System.out.println(_0x0064); 언더바 안됀다.

    System.out.println(0xffaa);

  }
}
