package com.eomcs.lms;

import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import com.eomcs.lms.dao.BoardDao;
import com.eomcs.lms.dao.LessonDao;
import com.eomcs.lms.dao.MemberDao;
import com.eomcs.lms.dao.PhotoBoardDao;
import com.eomcs.lms.dao.PhotoFileDao;
import com.eomcs.sql.MybatisDaoFactory;
import com.eomcs.sql.PlatformTransactionManager;
import com.eomcs.sql.SqlSessionFactoryProxy;

// Spring IoC 컨테이너가 탐색할 패키지 설정
// => 지정한 패키지 및 그 하위 패키지를 모두 뒤져서
// @Component 애노테이션이 붙은 클래스를 찾아 객체를 생성한다.
//
@ComponentScan(value = "com.eomcs.lms")
public class AppConfig {

  SqlSessionFactory sqlSessionFactory;
  MybatisDaoFactory daoFactory;

  public AppConfig() throws Exception {

    // Mybatis 설정 파일을 로딩할 때 사용할 입력 스트림 준비
    InputStream inputStream = Resources.getResourceAsStream(//
        "com/eomcs/lms/conf/mybatis-config.xml");

    // 트랜잭션 제어를 위해 오리지널 객체를 프록시 객체에 담아 사용한다.
    sqlSessionFactory = new SqlSessionFactoryProxy(//
        new SqlSessionFactoryBuilder().build(inputStream));

    // DAO 프록시 객체를 생성해 줄 Factory 를 준비
    daoFactory = new MybatisDaoFactory(sqlSessionFactory);
  }

  // Spring IoC 컨테이너에 수동으로 객체를 등록하고 싶다면,
  // 그 객체를 만들어주는 팩토리 메서드를 정의해야 한다.
  // => 단, 메서드 선언부에 @Bean 애노테이션을 붙여야한다.
  // => 그래야만 Spring IoC 컨테이너는
  // 이 메서드를 호출하고 그 리턴 값을 보관한다.

  @Bean
  public PlatformTransactionManager TransactionManager() {
    return new PlatformTransactionManager(sqlSessionFactory);
  }

  @Bean
  public BoardDao boardDao() {
    return daoFactory.createDao(BoardDao.class);
  }

  @Bean
  public LessonDao lessonDao() {
    return daoFactory.createDao(LessonDao.class);
  }

  @Bean
  public MemberDao memberDao() {
    return daoFactory.createDao(MemberDao.class);
  }

  @Bean
  public PhotoBoardDao photoBoardDao() {
    return daoFactory.createDao(PhotoBoardDao.class);
  }

  @Bean
  public PhotoFileDao photoFileDao() {
    return daoFactory.createDao(PhotoFileDao.class);
  }


}


