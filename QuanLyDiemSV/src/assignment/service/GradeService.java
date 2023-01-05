/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.service;

import assignment.model.Grade;
import assignment.model.Student;
import assignment.repository.GradeRepository;
import java.util.List;

/**
 *
 * @author Admin
 */
public class GradeService {
    GradeRepository repository;

    public GradeService() {
        repository = new GradeRepository();
    }
    
    public boolean saveGrade(Grade g) {
        return this.repository.saveGrade(g);
    }

    public Grade getGradeByIdStudent(String id) {
        return this.repository.getGradeByIdStudent(id);
    }

    public boolean deleteGrade(String masv) {
        return this.repository.deleteGrade(masv);
    }

    public List<Grade> getTop3() {
        return this.repository.getTop3();
    }
    public List<Grade> getAllGrade(){
         return this.repository.getAllGrade();
    }

    public boolean updateGrade(Grade grade) {
        return this.repository.updateGrade(grade);
    }
}
