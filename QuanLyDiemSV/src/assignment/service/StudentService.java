/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.service;

import assignment.model.Student;
import assignment.repository.StudentRepository;
import java.util.List;

/**
 *
 * @author Admin
 */
public class StudentService {
    StudentRepository studentRepository;

    public StudentService() {
        studentRepository = new StudentRepository();
    }
    
    public List<Student> getAllStudents(){
        return this.studentRepository.getAllStudents();
    } 

    public boolean saveStudents(List<Student> list) {
        if(!list.isEmpty()){
            return this.studentRepository.saveStudents(list);
        }
        return false;
    }

    public boolean deleteStudent(String masv) {
        return this.studentRepository.deleteStudent(masv);
    }

    public boolean updateStudent(Student student) {
        return this.studentRepository.updateStudent(student);
    }
    public Student getStudentById(String masv){
        return this.studentRepository.getStudentById(masv);
    }
}
