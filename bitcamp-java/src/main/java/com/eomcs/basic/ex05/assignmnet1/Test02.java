// 산술 연산자 : 연산의 결과 타입  
package ex05.assignmnet1;

import java.util.Scanner;

// 다섯 개의 정수 값을 입력 받고 최소 최대값 구하라
// 입력 4 17 -1 6 9
// 최소값 -1
// 최대값 17



public class Test02 {
  public static void main(String[] args) {

    Scanner keyScan = new Scanner(System.in);


    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

    System.out.print("입력? ");
    while (true) {
      int no = keyScan.nextInt();
      if (no == 0) // 입력 값으로 0을 사용할 수 없는 문제가 있다.
      break;
      
      min = no < min ? no : min;
      max = no > max ? no : max;


    }     

    System.out.printf("최소값: %d\n", min);
    System.out.printf("최대값: %d\n", max);

    keyScan.close();
  }
}



























/* 
    System.out.printf("입력? ");

    System.out.println();

    ArrayList<Integer> number_list = new ArrayList<>(Arrays.asList(7, 4, 12, 8, 9));

    int max_num = number_list.get(0);
    int min_num = number_list.get(0);

    for(int num: number_list) {
        // Find Max Number
        if(max_num < num) {
            max_num = num;
        }

        // Find Min Number
        if(min_num > num) {
            min_num = num;
        }
    }

    System.out.println("Max Number: "+max_num);
    System.out.println("min Number: "+min_num);
 */
