package com.eomcs.net.xx00;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client5 {
  public static void main(String[] args) throws Exception {

    System.out.println("클라이언트 실행");

    File file = new File("temp/jls11.pdf"); // c

    BufferedInputStream fileIn = new BufferedInputStream(new FileInputStream("temp/photo.jpg")); // c

    System.out.println("서버에 연결중");

    Socket socket = new Socket("192.168.1.24", 9999);

    System.out.println("서버에 연결 완료");

    DataOutputStream out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream())); // c
    Scanner in = new Scanner(new BufferedInputStream(socket.getInputStream())); // c

    System.out.println("서버에 데이터 송신 중");

    long startTime = System.currentTimeMillis();

    out.writeLong(file.length());

    out.writeUTF(file.getName());

    int b;
    while ((b = fileIn.read()) != -1) {
      out.write(b);
    }
    out.flush();

    long endTime = System.currentTimeMillis();

    System.out.printf("서버에 데이터 송신 완료 \n", endTime - startTime);

    String response = in.nextLine();
    System.out.println(response);

    in.close();
    out.close();
    socket.close();
    fileIn.close();
  }

}


