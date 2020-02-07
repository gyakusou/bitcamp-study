package com.eomcs.net.xx00;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server3 {

  public static void main(String[] args) throws Exception {

    System.out.println("서버 실행");

    Scanner keyScan = new Scanner(System.in);

    ServerSocket serverSocket = new ServerSocket(9999);

    Socket socket = serverSocket.accept();

    PrintStream out = new PrintStream(socket.getOutputStream());
    Scanner in = new Scanner(socket.getInputStream());

    while (true) { // +

      String str = in.nextLine();
      System.out.println(str);

      System.out.print("입력> ");
      str = keyScan.nextLine();
      out.println(str);

      if (str.equalsIgnoreCase("q")) // +
        break; // +
    }

    in.close();
    out.close();
    socket.close();
    serverSocket.close();
    keyScan.close(); // +
  }

}
