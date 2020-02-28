// mybatis + spring IoC - 트랜잭션 적용 후
package com.eomcs.mybatis.ex04;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam01_list {

  public static void main(String[] args) throws Exception {
    ClassPathXmlApplicationContext iocContainer = 
        new ClassPathXmlApplicationContext(
            "step25/ex9/application-context.xml");

    BoardDao boardDao = iocContainer.getBean(BoardDao.class);

    List<Board> list = boardDao.selectList();
    for (Board b : list) {
      System.out.printf("%d, %s, %s\n",
          b.getNo(), b.getTitle(), b.getRegisteredDate());
    }
  }
}







