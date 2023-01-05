/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.repository;

import assignment.model.User;
import assignment.util.JDBCHelper;

/**
 *
 * @author Admin
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class UserRepository {
    JDBCHelper helper;

    public UserRepository() {
        helper= new JDBCHelper();
    }
    
    public User getUserForRole(User user) {
        String sql = "select top 1 * from users where username = ? and password = ?";
        ResultSet rs = helper.executeQuery(sql, user.getUserName(),user.getPassword());
        try {
            while(rs.next()){
                user.setRole(rs.getInt("role"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
         return user;
    }
    
}
