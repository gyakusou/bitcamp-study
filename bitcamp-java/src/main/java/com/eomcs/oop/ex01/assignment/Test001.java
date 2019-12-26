package com.eomcs.oop.ex01.assignment;

import java.util.Scanner;

public class Test001 {
  
  public static void main(String[] args) {
    
   Scanner keyboard = new Scanner(System.in);
   
   class Score {
     String name;
     int kor;
     int eng;
     int math;
   }
   
   final int SIZE = 100;
   Class[] Score = new Class[SIZE];
   int count = 0;
   
   String command;
   
   Score[] arr = new Score[4];
   
   for (int i = 0; i < arr.length; i++) {
     arr[i] = new Score();
     
   }
   
   arr[0].name = "홍길동";
   arr[1].name = "임꺽정";
   arr[2].name = "유관순";
   
   System.out.print("입력? ");
   String input = keyboard.nextLine();
   
   
   
   for(int i = 0; i < arr.length; i++) {
   
   System.out.printf("$s %d %d %d\n", 
       arr[i].name, arr[i].kor, arr[i].eng, arr[i].math );
   }
  }

}
