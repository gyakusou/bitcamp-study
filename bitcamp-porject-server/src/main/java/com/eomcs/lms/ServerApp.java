package com.eomcs.lms;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerApp {

  public static void main(String[] args) {

    try (ServerSocket serverSocket = new ServerSocket(9999)) { // serverSocket에 9999넣고 연결대기
      System.out.println("클라이언트 연결 대기중");

      while (true) {
        Socket socket = serverSocket.accept();
        System.out.println("클라이언트와 연결됨");

        processRequest(socket);

        System.out.println("--------");
      }
    } catch (Exception e) {
      System.out.println("서버 준비 중 오류 발생");
      return;
    }
  }

  static void processRequest(Socket clientSocket) {
    try (Socket socket = clientSocket;

        Scanner in = new Scanner(socket.getInputStream());
        PrintStream out = new PrintStream(socket.getOutputStream())) {

      System.out.println("통신을 위한 입출력 스트림 준비");

      String message = in.nextLine();
      System.out.println("클라이언트가 보낸 메세지를 수신");
      System.out.println("클라이언트: " + message);

      out.println("Hi");
      System.out.println("클라이언트로 메세지 전송");

    } catch (Exception e) {
      System.out.println("예외발생");
      e.printStackTrace();
    }


  }
}

// v32_2 까지했음
