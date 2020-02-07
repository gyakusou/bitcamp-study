package com.eomcs.net.xx00;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client4 {
  public static void main(String[] args) throws Exception {

    System.out.println("클라이언트 실행");

    // Scanner keyScan = new Scanner(System.in); // -

    File file = new File("temp/photo.jpg"); // +

    FileInputStream fileIn = new FileInputStream(file); // +

    System.out.println("서버에 연결중"); // +

    Socket socket = new Socket("192.168.1.24", 9999);

    System.out.println("서버에 연결 완료"); // +

    DataOutputStream out = new DataOutputStream(socket.getOutputStream()); // +
    Scanner in = new Scanner(socket.getInputStream()); // +

    System.out.println("서버에 데이터 송신 중");

    long startTime = System.currentTimeMillis();

    out.writeLong(file.length());

    out.writeUTF(file.getName());

    int b;
    while ((b = fileIn.read()) != -1) {
      out.write(b);
    }

    long endTime = System.currentTimeMillis();

    System.out.printf("서버에 데이터 송신 완료 \n", endTime - startTime);

    String response = in.nextLine();
    System.out.println(response);

    /*
     * - while (true) {
     *
     * System.out.print("입력> "); String input = keyScan.nextLine(); out.println(input);
     *
     * String str = in.nextLine(); System.out.println(str);
     *
     * if (input.equalsIgnoreCase("q")) break; }
     */

    in.close();
    out.close();
    socket.close();
    fileIn.close();
  }

}


