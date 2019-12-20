package com.eomcs.basic.ex07.assignment;

/*
    // 배열의 값 중에서 최대 값을 출력하라.

    int[] values = {34, 4, -3, 78, 12, 22, 45, 0, -22};
    int value = max(values);
    System.out.println(value);
    // 출력결과:
    // 78
  }

  static int max(int[] values) {
    // 파라미터로 배열을 받고, 그 값 중에서 최대 값을 찾아 리턴한다.
    return 0;
  }
}
 */

import java.util.Scanner;

public class Test01 { // BJ.ex05.Te02 참고.

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    int max = Integer.MIN_VALUE;

    System.out.print("입력? ");
    while (true) {
      int no = keyboard.nextInt();
      if (no == 0)
        break;

      max = no > max ? no : max;
    }

    System.out.printf("출력결과: %d\n", max);

    keyboard.close();

  }
}