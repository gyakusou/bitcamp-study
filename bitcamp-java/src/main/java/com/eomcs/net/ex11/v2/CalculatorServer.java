// 계산기 서버 만들기 - 2단계: 반복문을 적용하여 클라이언트 요청을 계속 처리하게 만들기
package com.eomcs.net.ex11.v2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {
  public static void main(String[] args) {
    
    try (ServerSocket serverSocket = new ServerSocket(8888)) {
      System.out.println("서버 실행 중...");
      
      while (true) {
        try (Socket socket = serverSocket.accept();
            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
            PrintStream out = new PrintStream(socket.getOutputStream());) {
          
          String[] input = in.readLine().split(" ");
          
          int a = Integer.parseInt(input[0]);
          String op = input[1];
          int b = Integer.parseInt(input[2]);
          
          out.printf("결과는 %d 입니다.\n", a + b);
          out.flush();
        }
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
