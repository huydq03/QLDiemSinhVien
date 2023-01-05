/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.repository;

import assignment.model.Grade;
import assignment.model.Student;
import assignment.util.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class GradeRepository {
    JDBCHelper helper;
    public GradeRepository() {
        helper = new JDBCHelper();
    }

    public boolean saveGrade(Grade g) {
        String sql = "insert into grade (masv,tiengAnh,tinHoc,GDTC) values (?,?,?,?)";
        int aff = JDBCHelper.executeUpdate(sql, g.getMaSV(),g.getTiengAnh(),g.getTinHoc(),g.getgDTC());
        if(aff > 0) 
            return true;
        return false;
    }

    public Grade getGradeByIdStudent(String id) {
        String sql = "select top 1 * from grade where masv = ?";
        ResultSet rs = helper.executeQuery(sql, id);
        try {
            if(rs.next()) return getGradeByResultSet(rs);
        } catch (SQLException ex) {
            Logger.getLogger(GradeRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     private Grade getGradeByResultSet(ResultSet rs){
        try {
            String id = rs.getString(2);
            float english = rs.getFloat(3);
            float iT = rs.getFloat(4);
            float physical = rs.getFloat(5);
            Grade grade = new Grade();
            grade.setMaSV(id);
            grade.setTiengAnh(english);
            grade.setTinHoc(iT);
            grade.setgDTC(physical);
            return grade;
        } catch (SQLException ex) {
            Logger.getLogger(StudentRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean deleteGrade(String masv) {
        String sql = "delete from grade where masv = ?";
        int aff = JDBCHelper.executeUpdate(sql, masv);
        if(aff > 0) return true;
        return false;
    }

    public List<Grade> getTop3() {
        List<Grade> top3Students = new ArrayList<>();
        String sql = "select masv,tiengAnh,tinHoc,GDTC from grade order by ((tiengAnh+tinHoc+GDTC)/3) desc";
        ResultSet rs = helper.executeQuery(sql);
        try {
            while(rs.next()){
                Grade g = new Grade();
                g.setMaSV(rs.getString(1));
                g.setTiengAnh(rs.getFloat(2));
                g.setTinHoc(rs.getFloat(3));
                g.setgDTC(rs.getFloat(4));
                top3Students.add(g);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GradeRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return top3Students;
    }
    public List<Grade> getAllGrade(){
        String sql = "select * from grade";
        List<Grade> list = new ArrayList<>();
        ResultSet rs = helper.executeQuery(sql);
        try {
            while(rs.next()){
                Grade g = getGradeByResultSet(rs);
                list.add(g);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GradeRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public boolean updateGrade(Grade grade) {
        String sql = "update grade set tiengAnh = ?, tinHoc = ?, GDTC = ? where masv = ?";
        int aff = JDBCHelper.executeUpdate(sql, grade.getTiengAnh(),grade.getTinHoc(),grade.getgDTC(),grade.getMaSV());
        if(aff >0 ) return true;
        return false;
    }
    
}
