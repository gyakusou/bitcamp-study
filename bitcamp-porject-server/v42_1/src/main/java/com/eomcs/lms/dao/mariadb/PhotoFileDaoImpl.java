package com.eomcs.lms.dao.mariadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.eomcs.lms.dao.PhotoFileDao;
import com.eomcs.lms.domain.PhotoFile;
import com.eomcs.sql.DataSource;

public class PhotoFileDaoImpl implements PhotoFileDao {

  DataSource dataSource;

  public PhotoFileDaoImpl(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  @Override
  public int insert(PhotoFile photoFile) throws Exception {
    try (Connection con = dataSource.getConnection(); //
        PreparedStatement stmt = con.prepareStatement(//
            + "insert into lms_photo_file(photo_id,file_path) values(?,?)")) {
      
      stmt.setInt(1, photoFile.getNo());
      stmt.setString(2, photoFile.getFilepath());

      int result = stmt.executeUpdate( //
          "insert into lms_photo_file(photo_id,file_path) values(" //
              + photoFile.getBoardNo() + ", '" + photoFile.getFilepath() //
              + "')");

      return stmt.executeUpdate();
    }
  }

  @Override
  public List<PhotoFile> findAll(int boardNo) throws Exception {
    try (Connection con = dataSource.getConnection(); //
        PreparedStatement stmt = con.prepareStatement(//
            "select photo_file_id, photo_id, file_path" //
            + " from lms_photo_file" //
            + " where photo_id=?" //
            + " order by photo_file_id asc");

        ResultSet rs = stmt.executeQuery();
        
      ArrayList<PhotoFile> list = new ArrayList<>();
      while (rs.next()) {
        list.add(new PhotoFile() //
            .setNo(rs.getInt("photo_file_id")) //
            .setFilepath(rs.getString("file_path")) //
            .setBoardNo(rs.getInt("photo_id")));
      }
      return stmt.executeUpdate();
    }
  }

  @Override
  public int deleteAll(int boardNo) throws Exception {
    try (Connection con = dataSource.getConnection(); //
        PreparedStatement stmt = con.prepareStatement(//
            "delete from lms_photo_file" //
            + " where photo_id=?")) {
      
     stmt.setInt(1, no);
      
      return stmt.executeUpdate();
    }
  }

}
