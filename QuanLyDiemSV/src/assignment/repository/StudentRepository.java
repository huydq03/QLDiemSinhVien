/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.repository;

import assignment.model.Student;
import assignment.util.JDBCHelper;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Admin
 */
public class StudentRepository {
    JDBCHelper jDBCHelper;
    GradeRepository gradeRepository;
    public StudentRepository() {
        gradeRepository = new GradeRepository();
        jDBCHelper = new JDBCHelper();
    }
    
    public List<Student> getAllStudents(){
        List<Student> listStudents = new ArrayList<>();
        String sql = "select * from students";
        ResultSet rs = jDBCHelper.executeQuery(sql);
        try {
            while(rs.next()){
               Student student = getStudentByResultSet(rs);
               listStudents.add(student);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listStudents;
    }
    private Student getStudentByResultSet(ResultSet rs){
        try {
            String id = rs.getString(1);
            String name = rs.getString(2);
            String email = rs.getString(3);
            String phone = rs.getString(4);
            int gender = rs.getInt(5);
            String address = rs.getString(6);
            String image = rs.getString(7);
            Student student = new Student(id, name, email, phone, gender, address, image);
            return student;
        } catch (SQLException ex) {
            Logger.getLogger(StudentRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean saveStudents(List<Student> list) {
        String sql = "insert into students values (?,?,?,?,?,?,?)";
        int aff = 0;
        for(Student s : list){
            aff += JDBCHelper
            .executeUpdate(
            sql,
            s.getMasv(),
            s.getHoTen(),
            s.getEmail(),
            s.getSoDT(),
            s.getGioiTinh(),
            s.getDiaChi(),
            s.getHinh()
            );
        }
        if(aff > 0) return true;
        else return false;
    }

    public boolean deleteStudent(String masv) {
        String sql = "delete from students where masv = ?";
        gradeRepository.deleteGrade(masv);
        int aff = JDBCHelper.executeUpdate(sql, masv);
        if(aff > 0){
            return true;
        }
        return false;
    }

    public boolean updateStudent(Student student) {
        String sql = "update students set hoten = ?, email = ?, soDT = ?, gioiTinh = ?, diaChi = ?,hinh = ? where masv = ?";
        int aff = JDBCHelper
                    .executeUpdate(
                        sql,
                        student.getHoTen(),
                        student.getEmail(),
                        student.getSoDT(),
                        student.getGioiTinh(),
                        student.getDiaChi(),
                        student.getHinh(),
                        student.getMasv()
                    );
        if (aff > 0) {
            return true;
        }
        return false;
    }
    public Student getStudentById(String id){
        String sql = "select top 1 * from students where masv = ?";
        ResultSet rs = jDBCHelper.executeQuery(sql, id);
        try {
            if(rs.next()) return this.getStudentByResultSet(rs);
        } catch (SQLException ex) {
            Logger.getLogger(StudentRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
