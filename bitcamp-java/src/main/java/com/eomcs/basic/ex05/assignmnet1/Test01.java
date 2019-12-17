// 산술 연산자 : 연산의 결과 타입  
package ex05.assignmnet1;

import java.util.Scanner;

// 입력 받은 두 정수 사이의 합계를 구하라
// 입력 ? 2 , 5
// 2 에서 5 까지의 합은 14입니다.



public class Test01 {
  public static void main(String[] args) {

    Scanner keyScan = new Scanner(System.in); // ctrl + shift + o
                               //---------- => 디펜던시 인젝션 DI => 의존객체를 자동화 => IOC 컨테이너(스프링)

    // Scanner 는 도구 이를 읽기 위해서는 system
    //keyScan High Cohesion //한 클래스는 하나의 책임만 갖는다.
    
    System.out.println("입력? ");
    int start = keyScan.nextInt();
                    //----------=> 메서드 
    int end = keyScan.nextInt();
    
    int sum = 0;
    for (int no = start; no <= end; no++) {
      sum += no;
      
    }
    
    // 2 + 3 + 4 + 5 + 6 + 7 =27
    
    
    System.out.printf("%d 에서 %d 까지의 합은 %d 입니다. \n", start, end, sum);
    //------ => 콘솔창으로  출력
    

    keyScan.close();
    // 결과 피드백을 바탕으로 코드 수정
    // 초기 입력값이 변경되는 문제
  }
}

/*
   int a;
   int b;
   int sum = 0;

   System.out.println("첫번째 수 입력? ");
   a = keyboard.nextInt();

   System.out.println("두번째 수 입력? ");
   b = keyboard.nextInt();

   if (a>b)
   {
     int sub = a;
     a = b;
     b = sub;
   }

   for (int i = a; i <=b; i = i+1) {
     sum = sum+i;
   }

   System.out.println();

   System.out.println("두 수" + a + "~" + b + "사이의 합은");
   System.out.println(sum + "입니다.");
 */



    
    
    
    
    
    
    

