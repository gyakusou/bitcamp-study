package com.eomcs.lms;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp {

  public static void main(String[] args) throws Exception {

    String serverAddr = null;
    int port = 0;

    Scanner keyScan = new Scanner(System.in);

    try {

      System.out.print("서버? ");
      serverAddr = keyScan.nextLine();

      System.out.print("포트? ");
      port = Integer.parseInt(keyScan.nextLine());

    } catch (Exception e) {
      System.out.println("서버주소 or 포트번호가 유효하지 않습니다.");
      keyScan.close();
      return;
    }

    try (

        Socket socket = new Socket(serverAddr, port);
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream())) {

      System.out.println("서버와 연결됨");
      System.out.print("서버에 보낼 메세지: ");
      String sendMsg = keyScan.nextLine();

      out.println(sendMsg);
      System.out.println("서버에 메세지를 전송");

      String message = in.nextLine();
      System.out.println("서버로부터 메세지 수신");

      System.out.println("서버: " + message);

      System.out.println("서버와 연결 끊음");

    } catch (Exception e) {
      System.out.println("예외발생");
      e.printStackTrace();
    }
    keyScan.close();
  }
}

// v32_2 까지했음
