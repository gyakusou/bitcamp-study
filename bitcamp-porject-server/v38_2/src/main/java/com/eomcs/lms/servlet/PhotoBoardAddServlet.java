package com.eomcs.lms.servlet;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import com.eomcs.lms.dao.LessonDao;
import com.eomcs.lms.dao.PhotoBoardDao;
import com.eomcs.lms.dao.PhotoFileDao;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.domain.PhotoBoard;
import com.eomcs.lms.domain.PhotoFile;;

public class PhotoBoardAddServlet implements Servlet {

  PhotoBoardDao photoBoardDao; // lms_photoBoard 담당
  LessonDao lessonDao; // + lms_lesson 담당
  PhotoFileDao photoFileDao; // + lms_photo_file 담당

  public PhotoBoardAddServlet(PhotoBoardDao photoBoardDao, LessonDao lessonDao,
      PhotoFileDao photoFileDao) {
    this.photoBoardDao = photoBoardDao;
    this.lessonDao = lessonDao;
    this.photoFileDao = photoFileDao;
  }

  @Override
  public void service(Scanner in, PrintStream out) throws Exception {

    PhotoBoard photoBoard = new PhotoBoard();

    out.println("제목? \n!{}!");
    photoBoard.setTitle(in.nextLine());

    out.println("수업번호? \n!{}!");

    // 유효성 검사 (FK 이기 때문에)
    int lessonNo = Integer.parseInt(in.nextLine());
    Lesson lesson = lessonDao.findByNo(lessonNo);
    if (lesson == null) {
      out.println("수업 번호가 유효하지 않습니다.");
      return;
    }

    photoBoard.setLesson(lesson);

    if (photoBoardDao.insert(photoBoard) > 0) { // 등록했다면,
      // insert 에서 넣은 PK값이 들어있을 것이다.

      // 첨부 파일을 입력 받는다.
      out.println("최소 한개의 사진 파일을 등록해야 합니다.");
      out.println("파일명 입력 없이 그냥 엔터를 치면 파일 추가를 마칩니다.");

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

        // 1) 기본 생성자를 사용할 때,
        // PhotoFile photoFile = new PhotoFile();
        // photoFile.setFilepath(filepath);
        // photoFile.setBoardNo(photoBoard.getNo()); // PK값을 photoFile에 담는다.
        // photoFiles.add(photoFile);

        // 2) 초기값을 설정하는 생성자를 사용할 때,
        // PhotoFile photoFile = new PhotoFile(filepath, photoBoard.getNo());
        // photoFiles.add(photoFile);
        // photoFiles.add(new PhotoFile(filepath, photoBoard.getNo()));

        // 3) setter 메서를 활용하여 체인 방식으로 인스턴스 필드의 값을 설정
        // doamin.PhotoFile 의 리턴 값을 설정 후. ★
        photoFiles.add(new PhotoFile() //
            .setFilepath(filepath) //
            .setBoardNo(photoBoard.getNo()));

      }

      // ArrayList에 들어있는 PhotoFile 데이터를 lms_photo_file 테이블에 저장한다.
      for (PhotoFile photoFile : photoFiles) { // 처음부터 끝까지 반복할 때는 향상된 for문 쓴다.
        photoFileDao.insert(photoFile);
      }
      out.println("새 사진 게시글을 등록했습니다.");
    } else {
      out.println(" 사진 게시글 등록에 실패했습니다.");
    }
  }
}
// ★
// FK colum 이 있기 때문에 가리키는 no가 아니면 등록이 되지 않는다.
