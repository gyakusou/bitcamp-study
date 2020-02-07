// 파일받기

package com.eomcs.net.xx00;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server5 {

  public static void main(String[] args) throws Exception {

    System.out.println("서버 실행");

    ServerSocket serverSocket = new ServerSocket(9999);

    Socket socket = serverSocket.accept();

    System.out.println("클라이언트가 연결됨");

    PrintStream out = new PrintStream(new BufferedOutputStream(socket.getOutputStream())); // c
    DataInputStream in = new DataInputStream(new BufferedInputStream(socket.getInputStream())); // c

    System.out.println("클라이언트로부터 데이터 수신 중..");

    long filesize = in.readLong();

    String filename = in.readUTF();

    File file = new File("temp/new_" + filename);
    BufferedOutputStream fileOut = new BufferedOutputStream(new FileOutputStream(file)); // c

    for (long i = 0; i < filesize; i++) {
      fileOut.write(in.read());
    }
    System.out.println("클라이어트로부터 데이터 수신완료"); // +

    out.println("OK");
    out.flush(); // +

    in.close();
    out.close();
    socket.close();
    serverSocket.close();
    fileOut.close();
  }

}
