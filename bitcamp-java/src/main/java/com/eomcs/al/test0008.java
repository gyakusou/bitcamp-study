package com.eomcs.al;

// 같은 숫자는 싫어요

public class test0008 {
  public static void main(String[] args) {
    System.out.println();

  }

  // public static int[] solution(int[] arr) {
  // Deque<Integer> d = new LinkedList<>();
  // d.add(1);
  // d.add(2);
  // d.add(3);
  // d.add(4);
  // d.add(5);
  //
  // Integer[] res = d.toArray(new Integer[d.size()]);
  //
  // int[] res2 = d.stream().mapToInt(i -> i).toArray();
  //
  //
  //
  // }
}



// 1.
// int count = 1; // 새로운 배열의 크기를 측정
// for (int i = 1; i < arr.length; i++) {
// if (arr[i - 1] != arr[i])
// count++;
// }
// int[] arr2 = new int[count];
// int alen = 1; // 새로운 배열에서 값을 넣어줄때
// for (int i = 1; i < arr.length; i++) {
// arr2[0] = arr[0];
// if (arr[i - 1] != arr[i]) {
// arr2[alen] = arr[i];
// alen++;
// }
// }
// return arr2;

// 2.
// List<Integer> numbers = new ArrayList<>();
// numbers.add(arr[0]);
//
// for (int i = 1; i < arr.length; i++) {
// if (arr[i] != arr[i - 1]) {
// numbers.add(arr[i]);
// }
// }
// int[] temp = new int[numbers.size()];
// for (int i = 0; i < temp.length; i++) {
// temp[i] = numbers.get(i);
//
// }
// return temp;

// 3.
// Deque<E> d = new LinkedList<>();
// d.add(arr[0]);
// for (int i = 1; i < arr.length; i++)
// if ((Integer) d.peekLast() != arr[i])
// d.add(arr[i]);
//
// int i = 0;
// int[] res = new int[d.size()];
// while (!d.isEmpty())
// res[i++] = (Integer) d.pollFirest();
// return res;
