package com.eomcs.net.xx00;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
  public static void main(String[] args) throws Exception {

    System.out.println("클라이언트 실행");

    Scanner keyScan = new Scanner(System.in); // +

    Socket socket = new Socket("192.168.1.24", 9999);

    PrintStream out = new PrintStream(socket.getOutputStream());
    Scanner in = new Scanner(socket.getInputStream());

    System.out.print("입력> ");
    String input = keyScan.nextLine(); // +
    out.println(input); // +

    String str = in.nextLine();
    System.out.println(str);

    in.close();
    out.close();
    socket.close();
    keyScan.close();
  }

}


