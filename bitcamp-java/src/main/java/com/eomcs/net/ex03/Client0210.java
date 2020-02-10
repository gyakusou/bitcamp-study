// 서버와 입출력 테스트 - character stream
package com.eomcs.net.ex03;

// printStream = 바이트스트림 0210
// PrintWriter = 캐릭터스트림 0220 - 내부적으로 buffer 활용

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client0210 {
  public static void main(String[] args) {

    Scanner keyScan = new Scanner(System.in);

    try (Socket socket = new Socket("localhost", 8888);
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
      // InputStream(바이트스트림) 을 BufferedReader(캐릭터스트림) 을 붙일 수가 없다.
      // 바이트와 캐릭터 스트림을 연결 할 수 없기 때문에,
      // 이 둘을 붙이려면 중간에 InputStreamReader가 필요하다.

      System.out.println("서버와 연결되었음!");

      // 서버에 데이터를 보내기 전에 잠깐 멈춤
      System.out.println(">");
      keyScan.nextLine();

      out.println("ABC가각간");

      // out.flush(); // Test

      // character stream 클래스의 경우
      // 출력 데이터를 내부 버퍼에 보관하고 있다가
      // flush()가 호출되면 비로소 출력을 수행한다.
      // 따라서 위 출력 문자열은 서버에 보내지 않는다.


      System.out.println("서버에 데이터를 보냈음!");

      String str = in.readLine();
      System.out.println(str);

    } catch (Exception e) {
      e.printStackTrace();
    }

    keyScan.close();
  }
}


