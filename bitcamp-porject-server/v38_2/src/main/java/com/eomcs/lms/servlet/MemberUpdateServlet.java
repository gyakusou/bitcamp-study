package com.eomcs.lms.servlet;

import java.io.PrintStream;
import java.util.Scanner;
import com.eomcs.lms.dao.MemberDao;
import com.eomcs.lms.domain.Member;

public class MemberUpdateServlet implements Servlet {

  MemberDao memberDao;

  public MemberUpdateServlet(MemberDao memberDao) {
    this.memberDao = memberDao;
  }

  @Override
  public void service(Scanner in, PrintStream out) throws Exception {

    out.println("번호? \n!{}!");
    int no = Integer.parseInt(in.nextLine());

    Member old = memberDao.findByNo(no);
    if (old == null) {
      out.println("해당 번호의 회원이 없습니다.");
      return;
    }

    out.printf("이름(%s)? \n!{}!\n", old.getName());
    out.printf("이메일(%s)? \n!{}!\n", old.getEmail());
    out.printf("암호(%s)? \n!{}!\n", old.getPassword());
    out.printf("사진(%s)? \n!{}!\n", old.getPhoto());
    out.printf("전화(%s)? \n!{}!\n", old.getTel());

    Member member = new Member();
    member.setNo(no);
    member.setName(in.nextLine());
    member.setEmail(in.nextLine());
    member.setPassword(in.nextLine());
    member.setPhoto(in.nextLine());
    member.setTel(in.nextLine());

    if (memberDao.update(member) > 0) {
      out.println("멤버를 변경했습니다.");

    } else {
      out.println("멤버 변경에 실패했습니다.");
    }
  }
}
