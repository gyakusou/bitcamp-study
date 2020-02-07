package com.eomcs.net.xx00;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
  public static void main(String[] args) throws Exception {

    System.out.println("클라이언트 실행");

    Socket socket = new Socket("192.168.1.24", 9999);

    PrintStream out = new PrintStream(socket.getOutputStream());
    Scanner in = new Scanner(socket.getInputStream());

    out.println("클라이언트 입니다.");

    String str = in.nextLine();
    System.out.println(str);

    in.close();
    out.close();
    socket.close();
  }

}
