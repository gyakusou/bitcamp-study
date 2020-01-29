package com.eomcs.io.ex06;

import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream extends FileOutputStream {
  byte[] buf = new byte[8196];
  int cursor;

  public BufferedOutputStream(String filename) throws Exception {
    super(filename);
  }

  @Override
  public void write(int b) throws IOException {
    if (cursor == buf.length) { // 버퍼가 다차면
      this.write(buf); // 버퍼에 들어있는 데이터를 한 번에 출력한다.
      cursor = 0; // 다시 커서를 초기화시킨다.
    }

    // 1바이트 출력하라고 하면 일단 버퍼에 저장할 것이다.
    buf[cursor++] = (byte) b;
  }


  @Override
  public void close() throws IOException {
    this.flush();
    super.close();
  }


  @Override
  public void flush() throws IOException {
    if (cursor > 0) { // 배열의 값을 방출하려면 0 보다 커야 한다.
      this.write(buf, 0, cursor); // 커서가 3이라면 0,1,2 3개 방출
      cursor = 0;
    }
  }

}


