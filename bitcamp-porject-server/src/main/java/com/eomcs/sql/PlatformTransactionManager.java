package com.eomcs.sql;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class PlatformTransactionManager {

  SqlSessionFactory sqlSessionFactory;

  public PlatformTransactionManager(SqlSessionFactory sqlSessionFactory) {
    this.sqlSessionFactory = sqlSessionFactory;
  }

  public void beginTransaction() throws Exception {
    // 수동 커밋으로 동작하는 SqlSession 객체를 준비한다.
    sqlSessionFactory.openSession(false);

    // openSession(false)을 호출하면
    // => 수동 커밋으로 동작하는 SqlSession을 만들어 스레드에 보관한다.
  }

  public void commit() throws Exception {
    // 스레드에 보관된 SqlSession 객체를 꺼낸다.
    SqlSession sqlSession = sqlSessionFactory.openSession();

    // 이 SqlSession 객체를 통해 수행했던 모든 데이터 변경 작업을 승인한다.
    sqlSession.commit();
  }

  public void rollback() throws Exception {
    // 이 SqlSession 객체로 작업했던 모든 데이터 변경을 취소한다.
    SqlSession sqlSession = sqlSessionFactory.openSession();

    sqlSession.rollback();
  }
}
