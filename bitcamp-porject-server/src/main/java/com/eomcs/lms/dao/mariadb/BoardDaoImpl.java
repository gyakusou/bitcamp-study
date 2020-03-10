package com.eomcs.lms.dao.mariadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.eomcs.lms.dao.BoardDao;
import com.eomcs.lms.domain.Board;
import com.eomcs.sql.DataSource;

public class BoardDaoImpl implements BoardDao {

  DataSource dataSource;
  SqlSessionFactory sqlSessionFactory;

  public BoardDaoImpl(DataSource dataSource, SqlSessionFactory sqlSessionFactory) {
    this.dataSource = dataSource;
    this.sqlSessionFactory = sqlSessionFactory;
  }

  @Override
  public int insert(Board board) throws Exception {

    try (Connection con = dataSource.getConnection(); //
        PreparedStatement stmt = con.prepareStatement(//
            "insert into lms_board(conts) values(?)")) {
      stmt.setString(1, board.getTitle());
      return stmt.executeUpdate();
    }
  }

  @Override
  public List<Board> findAll() throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      return sqlSession.selectList("BoardMapper.selectBoard");
    }
  }

  @Override
  public Board findByNo(int no) throws Exception {
    try (Connection con = dataSource.getConnection(); //
        PreparedStatement stmt = con.prepareStatement(//
            "select board_id, conts, cdt, vw_cnt" //
                + " from lms_board" //
                + " where board_id=?")) {
      stmt.setInt(1, no);
      try (ResultSet rs = stmt.executeQuery()) {
        if (rs.next()) { // 데이터를 한 개 가져왔으면 true를 리턴한다.
          Board board = new Board();
          board.setNo(rs.getInt("board_id"));
          board.setTitle(rs.getString("conts"));
          board.setDate(rs.getDate("cdt"));
          board.setViewCount(rs.getInt("vw_cnt"));
          return board;
        } else {
          return null;
        }
      }
    }
  }

  @Override
  public int update(Board board) throws Exception {
    try (Connection con = dataSource.getConnection(); //
        PreparedStatement stmt = con.prepareStatement(//
            "update lms_board set" //
                + " conts=?" //
                + " where board_id=?")) {
      stmt.setString(1, board.getTitle());
      stmt.setInt(2, board.getNo());
      return stmt.executeUpdate();
    }
  }

  @Override
  public int delete(int no) throws Exception {
    try (Connection con = dataSource.getConnection(); //
        PreparedStatement stmt = con.prepareStatement(//
            "delete from lms_board"//
                + " where board_id=?")) {
      stmt.setInt(1, no);
      return stmt.executeUpdate();
    }
  }
}
