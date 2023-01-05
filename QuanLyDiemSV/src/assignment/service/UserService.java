/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.service;

import assignment.model.User;
import assignment.repository.UserRepository;

/**
 *
 * @author Admin
 */
public class UserService {
    private UserRepository userRepository;
    public UserService() {
        userRepository = new UserRepository();
    }

    public User getUserForRole(User user) {
        return this.userRepository.getUserForRole(user);
    }
    
}
