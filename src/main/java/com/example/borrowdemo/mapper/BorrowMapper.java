package com.example.borrowdemo.mapper;

import com.example.borrowdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BorrowMapper {
    // User
    List<User> getUserList();
    User getUserById(String id);
    void insertUser(User user);
    void updateUser(User user);
    void deleteUserById(String id);

    // Book


}
