package com.eomcs.sql;

import java.lang.reflect.Proxy;
import org.apache.ibatis.session.SqlSessionFactory;

public class MybatisDaoFactory {

  DaoInvocationHandler daoInvocationHandler;

  public MybatisDaoFactory(SqlSessionFactory sqlSessionFactory) {

    daoInvocationHandler = new DaoInvocationHandler(sqlSessionFactory);
  }

  public Object createDao(Class<?> daoInterface) {
    return Proxy.newProxyInstance( //
        this.getClass().getClassLoader(), //
        new Class[] {daoInterface}, //
        daoInvocationHandler);
  }
}
