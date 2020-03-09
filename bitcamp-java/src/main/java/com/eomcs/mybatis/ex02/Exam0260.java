// Mybatis - Delete SQL 실행하기
package com.eomcs.mybatis.ex02;

import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Exam0260 {

  public static void main(String[] args) throws Exception {
    InputStream inputStream = Resources.getResourceAsStream(//
        "com/eomcs/mybatis/ex02/mybatis-config09.xml");
    SqlSessionFactory factory = //
        new SqlSessionFactoryBuilder().build(inputStream);

    SqlSession sqlSession = factory.openSession();

    // insert, update, delete 는 내부적으로 코드가 같지만,
    // 유지보수를 위해서 기능에 맞는 메서드명으로 바꾸는 것이 좋다.

    // 먼저 자식테이블의 데이터를 지운다.
    int count = sqlSession.delete("BoardMapper.deleteBoardFile", 3);
    // insert, update, delete 된 값이 리턴된다.
    // 3번 파일은 첨부파일이 3개이기 때문에 count 값이 3이 나왔다.
    System.out.println(count);

    // 그런 후 부모 테이블의 데이터를 지운다.
    count = sqlSession.delete("BoardMapper.deleteBoard", 3);
    // 3번 값 지우기.
    System.out.println(count);

    sqlSession.commit();

    // 용어 정리!
    // commit : 임시 메모리에 저장된 작업 결과를 실제 테이블에 반영시키는 명령
    // rollback : 임시 메모리에 저장된 작업 결과를 취소하는 명령

    sqlSession.close();
  }

}


