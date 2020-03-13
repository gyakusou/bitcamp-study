package com.eomcs.sql;

import java.lang.reflect.Proxy;
import org.apache.ibatis.session.SqlSessionFactory;

public class MybatisDaoFactory {

  DaoInvocationHandler daoInvocationHandler;

  public MybatisDaoFactory(SqlSessionFactory sqlSessionFactory) {

    daoInvocationHandler = new DaoInvocationHandler(sqlSessionFactory);
  }

  // T는 클래스 이름을 담고 있는 변수.
  @SuppressWarnings("unchecked")
  public <T> T createDao(Class<T> daoInterface) {
    return (T) Proxy.newProxyInstance( //
        this.getClass().getClassLoader(), //
        new Class[] {daoInterface}, //
        daoInvocationHandler);
  }
}
