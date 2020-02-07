package com.eomcs.net.xx00;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {
  public static void main(String[] args) throws Exception {

    System.out.println("서버 실행");

    ServerSocket serverSocket = new ServerSocket(9999);

    Socket socket = serverSocket.accept();

    PrintStream out = new PrintStream(socket.getOutputStream());
    Scanner in = new Scanner(socket.getInputStream());

    String str = in.nextLine();
    System.out.printf("상대편> %s\n", str);

    out.println("안녕하세요. 서버입니다.");

    in.close();
    out.close();
    socket.close();
    serverSocket.close();
  }

}
