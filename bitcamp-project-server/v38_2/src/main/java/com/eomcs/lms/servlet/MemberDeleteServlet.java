package com.eomcs.lms.servlet;

import java.io.PrintStream;
import java.util.Scanner;
import com.eomcs.lms.dao.MemberDao;

public class MemberDeleteServlet implements Servlet {

  MemberDao memberDao;

  public MemberDeleteServlet(MemberDao memberDao) {
    this.memberDao = memberDao;
  }

  @Override
  public void service(Scanner in, PrintStream out) throws Exception {

    out.println("번호? \n!{}!");
    int no = Integer.parseInt(in.nextLine());

    if (memberDao.delete(no) > 0) {
      out.println("멤버를 삭제했습니다.");

    } else {
      out.println("해당 번호의 멤버가 없습니다.");
    }
  }
}
