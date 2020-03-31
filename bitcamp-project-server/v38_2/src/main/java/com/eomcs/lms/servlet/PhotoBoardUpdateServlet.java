package com.eomcs.lms.servlet;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.eomcs.lms.dao.PhotoBoardDao;
import com.eomcs.lms.dao.PhotoFileDao;
import com.eomcs.lms.domain.PhotoBoard;
import com.eomcs.lms.domain.PhotoFile;

public class PhotoBoardUpdateServlet implements Servlet {

  PhotoBoardDao photoBoardDao;
  PhotoFileDao photoFileDao;

  public PhotoBoardUpdateServlet(PhotoBoardDao photoBoardDao, PhotoFileDao photoFileDao) {
    this.photoBoardDao = photoBoardDao;
    this.photoFileDao = photoFileDao;
  }

  @Override
  public void service(Scanner in, PrintStream out) throws Exception {

    out.println("번호? \n!{}!");
    int no = Integer.parseInt(in.nextLine());

    PhotoBoard old = photoBoardDao.findByNo(no);
    if (old == null) {
      out.println("해당 번호의 사진 게시글이 없습니다.");
      return;
    }

    out.printf("제목(%s)? \n!{}!\n", old.getTitle());
    // 위 번호? 와 다르게 제목은 printf 이기 때문에 마지막에 줄바꿈 기호를 꼭 넣어줘야 한다.
    // '\n'

    PhotoBoard photoBoard = new PhotoBoard();
    photoBoard.setTitle(in.nextLine());
    photoBoard.setNo(no);

    if (photoBoardDao.update(photoBoard) > 0) { // 변경했다면,

      out.println("사진파일: ");

      List<PhotoFile> oldPhotoFiles = photoFileDao.findAll(no);
      for (PhotoFile photoFile : oldPhotoFiles) {
        out.printf("> %s\n", photoFile.getFilepath());
      }
      out.println();
      out.println("사지을 일부만 변경할 수 없습니다.");
      out.println("전체를 새로 등록해야 합니다.");
      out.println("사진을 변경하시겠습니까?(Y/n)");
      out.println("!{}!");
      out.flush();
      String response = in.nextLine();

      if (response.equalsIgnoreCase("y")) { // y가 맞다면

        // 이 사진 게시글에 첨부되었던 기존 파일을 모두 삭제한다. ★
        photoFileDao.deleteAll(no);

        // 새로 등록할 첨부 파일을 입력 받는다.
        out.println("최소 한개의 사진 파일을 등록해야 합니다.");
        out.println("파일명 입력 없이 그냥 엔터를 치면 파일 추가를 마칩니다.");

        // 사용자로부터 새로 입력받는다.
        ArrayList<PhotoFile> photoFiles = new ArrayList<>();

        while (true) {
          out.println("사진 파일? \n!{}!"); // 클라이언트 사진 파일 보내줘
          String filepath = in.nextLine();
          if (filepath.length() == 0) { // 입력하지 않았다면,
            if (photoFiles.size() > 0) {
              break;
            } else {
              out.println("최소 한개의 사진 파일을 등록해야 합니다.");
              continue; // while 반복.
            }
          }

          photoFiles.add(new PhotoFile() //
              .setFilepath(filepath) //
              .setBoardNo(photoBoard.getNo()));

        }

        for (PhotoFile photoFile : photoFiles) {
          photoFileDao.insert(photoFile);
        }
      }

      out.println("사진 게시글을 변경했습니다.");

    } else {
      out.println("사진 게시글 변경에 실패했습니다.");
    }
  }
}


