package com.example.borrowdemo.service;

import com.example.borrowdemo.entity.User;

import java.util.List;

public interface BorrowService {

    // User
    List<User> getUserList();
    User getUserById(String id);
    void insertUser(User user);
    void updateUser(User user);
    void deleteUserById(String id);

    // Book

}
