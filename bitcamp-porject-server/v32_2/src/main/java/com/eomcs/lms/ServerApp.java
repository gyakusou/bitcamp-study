// LMS 클라이언트

// 실행순서 서버(이클립스에서 실행) - 클라이언트(파워쉘 java -Dfile.encoding=UTF-8 -cp bin/main com.eomcs.lms.ClientApp)
// 안 될 경우 방화벽 끄고 실행

package com.eomcs.lms;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerApp {
  public static void main(String[] args) {
    System.out.println("서버 수업 관리 시스템입니다");

    try (
        // 서버쪽 연결 준비
        // => 클라이언트의 연결을 9999번 포트에서 기다린다.
        ServerSocket severSocket = new ServerSocket(9999)) {

      System.out.println("클라이언트 연결 대기중..");

      while (true) {

        // 서버에 대기하고 있는 클라이언트와 연결
        // => 대기하고 있는 클라이언트와 연결 될 때까지 리턴하지 않는다. ★
        Socket socket = severSocket.accept();
        System.out.println("클라이언트와 연결되었음");

        processRequest(socket);

        System.out.println("---------------END---------------");
      }

    } catch (Exception e) {
      System.out.println("서버 준비 중 오류 발생");
      return;
    }
  }

  static void processRequest(Socket clientSocket) {

    try (
        // 요청 처리가 끝난 후 클라이언트와 연결된 소켓을 자동으로 닫으려면
        // 이 괄호 안에 별도의 로컬 변수에 담는다.
        // close를 자동으로 호출하기 위해서.
        Socket socket = clientSocket;

        // 클라이언트의 메세지를 수신하고 클라이언트로 전송 할 입출력 도구를 준비한다.
        Scanner in = new Scanner(socket.getInputStream());
        PrintStream out = new PrintStream(socket.getOutputStream())) {

      System.out.println("통신을 위한 입출력 스트림을 준비하였음");

      // 클라이언트가 보낸 메세지를 수신한다.
      // => 한 줄의 메세지를 읽을 때 까지 리턴하지 않는다. ★
      String message = in.nextLine();
      System.out.println("클라이언트가 본내 메세지를 수신하였음");

      System.out.println("클라이언트: " + message);

      // 클라이언트에게 메세지를 전송한다.
      // => 클라이언트가 메세지를 모두 읽을 때 까지 리턴하지 않는다.★
      out.println("Hi(홍성준)");
      System.out.println("클라이언트로 메세지를 전송하였음");

    } catch (Exception e) {
      System.out.println("예외 발생: ");
      e.printStackTrace();
    }
  }
}

// java.net.BindException: Address already in use: NET_Bind
// 현재 서버가 9999 포트에서 기다리고 있는데 또 사용할때 나오는 오류
// ㄴ이전에 실행한 서버가 아직 실행 중 이다.
