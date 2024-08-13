package com.example.borrowdemo.controller;

import com.example.borrowdemo.entity.User;
import com.example.borrowdemo.service.impl.BorrowServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BorrowController {

    @Resource
    private BorrowServiceImpl borrowServiceImpl;

    /*
    // User
    List<User> getUserList();
    User getUserById(String id);
    void insertUser(User user);
    void updateUser(User user);
    void deleteUserById(String id);
     */

    @GetMapping("/user/getUserList")
    public List<User> getUserList() {
        List<User> userList = borrowServiceImpl.getUserList();
        return userList;
    }

    @GetMapping("/user/getUserById/{id}")
    public User getUserById(@PathVariable String id) {
        return borrowServiceImpl.getUserById(id);
    }

    @PostMapping("/user/insertUser")
    public User insertUser(@RequestBody User user) {
        borrowServiceImpl.insertUser(user);
        return user;
    }

    @PutMapping("/user/updateUser")
    public User updateUser(@RequestBody User user) {
        borrowServiceImpl.updateUser(user);
        return user;
    }

    @DeleteMapping("/user/deleteUserById/{id}")
    public String deleteUserById(@PathVariable String id) {
        borrowServiceImpl.deleteUserById(id);
        return "ok";
    }

}
