package com.eomcs.lms.dao.mariadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.eomcs.lms.dao.MemberDao;
import com.eomcs.lms.domain.Member;
import com.eomcs.sql.DataSource;

public class MemberDaoImpl implements MemberDao {

  SqlSessionFactory sqlSessionFactory;
  DataSource dataSource;

  public MemberDaoImpl(DataSource dataSource, SqlSessionFactory sqlSessionFactory) {
    this.dataSource = dataSource;
    this.sqlSessionFactory = sqlSessionFactory;
  }

  @Override
  public int insert(Member member) throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      int count = sqlSession.insert("MemberMapper.insertMember", member);
      sqlSession.commit();
      return count;
    }
  }

  @Override // list
  public List<Member> findAll() throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      return sqlSession.selectList("MemberMapper.selectMember");
    }
  }

  @Override
  public Member findByNo(int no) throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      return sqlSession.selectOne("MemberMapper.selectDetail", no);
    }
  }

  @Override
  public int update(Member member) throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      int count = sqlSession.update("MemberMapper.updateMember", member);
      sqlSession.commit();
      return count;
    }
  }

  @Override
  public int delete(int no) throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      int count = sqlSession.delete("MemberMapper.deleteMember", no);
      sqlSession.commit();
      return count;
    }
  }


  @Override
  public List<Member> findByKeyword(String keyword) throws Exception {
    try (Connection con = dataSource.getConnection(); //
        PreparedStatement stmt = con.prepareStatement(//
            "select member_id, name, email, tel, cdt" //
                + " from lms_member" //
                + " where name like ?"//
                + " or email like ?"//
                + " or tel like ?")) {
      String value = "%" + keyword + "%";
      stmt.setString(1, value);
      stmt.setString(2, value);
      stmt.setString(3, value);

      try (ResultSet rs = stmt.executeQuery()) {
        ArrayList<Member> list = new ArrayList<>();
        while (rs.next()) {
          Member member = new Member();
          member.setNo(rs.getInt("member_id"));
          member.setName(rs.getString("name"));
          member.setEmail(rs.getString("email"));
          member.setTel(rs.getString("tel"));
          member.setRegisteredDate(rs.getDate("cdt"));
          list.add(member);
        }
        return list;
      }
    }
  }

  @Override
  public Member findByEmailAndPassword(String email, String password) throws Exception {
    try (Connection con = dataSource.getConnection(); //
        PreparedStatement stmt = con.prepareStatement(//
            "select member_id, name, email, pwd, tel, photo" //
                + " from lms_member" //
                + " where email=? and pwd=password(?)")) {
      stmt.setString(1, email);
      stmt.setString(2, password);
      try (ResultSet rs = stmt.executeQuery()) {
        if (rs.next()) {
          Member member = new Member();
          member.setNo(rs.getInt("member_id"));
          member.setName(rs.getString("name"));
          member.setEmail(rs.getString("email"));
          member.setPassword(rs.getString("pwd"));
          member.setTel(rs.getString("tel"));
          member.setPhoto(rs.getString("photo"));
          return member;
        } else {
          return null;
        }
      }
    }
  }
}
