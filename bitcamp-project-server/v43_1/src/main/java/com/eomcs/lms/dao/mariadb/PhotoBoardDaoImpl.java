package com.eomcs.lms.dao.mariadb;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.eomcs.lms.dao.PhotoBoardDao;
import com.eomcs.lms.domain.PhotoBoard;

public class PhotoBoardDaoImpl implements PhotoBoardDao {

  SqlSessionFactory sqlSessionFactory;

  public PhotoBoardDaoImpl( //
      SqlSessionFactory sqlSessionFactory) {
    this.sqlSessionFactory = sqlSessionFactory;
  }

  @Override
  public int insert(PhotoBoard photoBoard) throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      int count = sqlSession.insert(//
          "PhotoBoardMapper.insertPhotoBoard", photoBoard);
      sqlSession.commit();
      // DAO에서는 commit 해서는 안됀다. insert, delete, udpate 할 때 다른 DAO 작업과 묶일수 없기 때문에
      return count;
    }
  }

  @Override
  public List<PhotoBoard> findAllByLessonNo(int lessonNo) throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      return sqlSession.selectList(//
          "PhotoBoardMapper.selectPhotoBoard", lessonNo);
    }
  }

  @Override
  public PhotoBoard findByNo(int no) throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      return sqlSession.selectOne("PhotoBoardMapper.selectDetail", no);
    }
  }

  @Override
  public int update(PhotoBoard photoBoard) throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      int count = sqlSession.update(//
          "PhotoBoardMapper.updatePhotoBoard", photoBoard);
      sqlSession.commit();
      return count;
    }
  }

  @Override
  public int delete(int no) throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      int count = sqlSession.delete("PhotoBoardMapper.deletePhotoBoard", no);
      sqlSession.commit();
      return count;
    }
  }

}
