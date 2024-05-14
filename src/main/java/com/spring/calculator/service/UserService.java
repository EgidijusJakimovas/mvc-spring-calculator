package com.spring.calculator.service;

import com.spring.calculator.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    User findByUsername(String username);

    User findUserByEmail(String email);

    boolean isEmailAlreadyTaken(String email);

    boolean isUsernameAlreadyTaken(String username);

    List<User> findAllUsers();

    User findByIdWithCalculations(int id);

}
