// 클라이언트와 입출력 테스트 - character stream
package com.eomcs.net.ex03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server0210 {
  public static void main(String[] args) {
    try (Scanner keyboard = new Scanner(System.in);
        ServerSocket serverSocket = new ServerSocket(8888)) {

      System.out.println("클라이언트의 연결을 기다리고 있음.");

      try (Socket socket = serverSocket.accept();
          BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
          // InputStream(바이트스트림) 을 BufferedReader(캐릭터스트림) 을 붙일 수가 없다.
          // 바이트와 캐릭터 스트림을 연결 할 수 없기 때문에,
          // 이 둘을 붙이려면 중간에 InputStreamReader가 필요하다.
          PrintWriter out = new PrintWriter(socket.getOutputStream())) {

        System.out.println("클라이언트와 보낸 한 줄의 문자열을 기다리고 있음.");

        String str = in.readLine();
        System.out.println(str);

        // 서버가 데이터를 보내지 않으면 클라이넡으의 read()는 리턴하지 않는다.
        // 이를 확인하기 위해 잠시 실행을 멈춘다.
        System.out.print(">");
        keyboard.nextLine();

        out.println(str);
        // out.flush();
        // character stream 클래스의 경우
        // 출력 데이터를 내부 버퍼에 보관하고 있다가
        // flush()가 호출되면 비로소 출력을 수행한다.
        // 따라서 위 출력 문자열은 클라이언트에 보내지 않는다.
        // 주의
        // => 단 close)(를 호출하면 close() 내부에서 flush()를 실행한다.
        // => try 블럭에서 나가면서 자동적으로 close() 되면서 flush()가 실행된다.
        // => 그러나 햇갈릴 수 있기 때문에 출력 후에는 항상 flush() 사용한다. ★

        System.out.println("클라인트에게 데이터를 보냈음.");

        // System.out.println("> ");
        // keyboard.nextLine();

      }
      System.out.println("클라이언트와의 연결을 끊었음.");

    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("서버 종료!");
  }

}

