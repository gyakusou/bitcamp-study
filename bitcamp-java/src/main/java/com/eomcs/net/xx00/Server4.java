// 파일받기

package com.eomcs.net.xx00;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server4 {

  public static void main(String[] args) throws Exception {

    System.out.println("서버 실행");

    // Scanner keyScan = new Scanner(System.in); // -

    ServerSocket serverSocket = new ServerSocket(9999);

    Socket socket = serverSocket.accept();

    System.out.println("클라이언트가 연결됨"); // +

    PrintStream out = new PrintStream(socket.getOutputStream());
    DataInputStream in = new DataInputStream(socket.getInputStream()); // c

    System.out.println("클라이언트로부터 데이터 수신 중.."); // +

    long filesize = in.readLong(); // +

    String filename = in.readUTF(); // +

    File file = new File("temp/new_" + filename); // +
    FileOutputStream fileOut = new FileOutputStream(file); // +

    for (long i = 0; i < filesize; i++) { // +
      fileOut.write(in.read()); // +
    }
    System.out.println("클라이어트로부터 데이터 수신완료"); // +

    /*
     * - while (true) {
     *
     * String str = in.nextLine(); System.out.println(str);
     *
     * System.out.print("입력> "); str = keyScan.nextLine();
     *
     * if (str.equalsIgnoreCase("q")) break; }
     */

    out.println("OK");

    in.close();
    out.close();
    socket.close();
    serverSocket.close();
    fileOut.close();
  }

}
