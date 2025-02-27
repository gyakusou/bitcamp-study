// LMS 클라이언트
package com.eomcs.lms;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp {
  public static void main(String[] args) throws Exception {
    System.out.println("클라이언트 수업 관리 시스템입니다");

    String serverAddr = null;
    int port = 0;

    // 키보드 스캐너 준비
    Scanner keyScan = new Scanner(System.in);

    try {

      // 사용자로부터 접속할 서버의 주소와 포트 번호를 입력받는다.
      System.out.print("서버? ");
      serverAddr = keyScan.nextLine();

      System.out.print("포트? ");
      port = Integer.parseInt(keyScan.nextLine());

    } catch (Exception e) {
      System.out.println("서버주소 또는 포트번호가 유효하지 않습니다.");
      keyScan.close();
      return; // 메인메서드 끝내버린다.
    }

    try ( // try() 안에는 오토클로저블 구현체만와야 한다.

        // 서버와 연결
        Socket socket = new Socket(serverAddr, port); // socket(연결할서버주소(도메인주소) , 포트번호)

        // 소켓을 통해 데이터를 읽고 쓰는 도구를 준비한다.
        PrintStream out = new PrintStream(socket.getOutputStream()); // 데코레이터
        Scanner in = new Scanner(socket.getInputStream())) { // 스캐너는 데코레이터가 아닌 헬퍼

      System.out.println("서버와 연결 되었음");

      System.out.print("서버에 보낼 메세지: ");
      String sendMsg = keyScan.nextLine();

      // 서버에 메세지를 전송한다.
      // => 서버가 메세지를 받을 때 까지 리턴하지 않는다.
      // => blocking 방식으로 동작한다.
      out.println(sendMsg);
      System.out.println("서버에 메세지를 전송하였음");

      // 서버가 응답한 메세지를 수신한다.
      // => 서버로부터 한 줄의 메세지를 받을때까지 리턴하지 않는다.
      // => blocking 방식으로 동작한다.
      String message = in.nextLine();
      System.out.println("서버로 부터 메세지를 수신하였음");

      // 서버가 받은 메세지를 출력한다.
      System.out.println("서버: " + message);

      System.out.println("서버와 연결을 끊었음");

    } catch (Exception e) {
      System.out.println("예외 발생: ");
      e.printStackTrace();
    }

    keyScan.close();
  }
}

// java.net.ConnectException: Connection refused: connect
// 서버와 연결이 안돼었음
