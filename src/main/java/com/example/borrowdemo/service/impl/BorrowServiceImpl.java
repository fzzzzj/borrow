package com.example.borrowdemo.service.impl;

import com.example.borrowdemo.entity.User;
import com.example.borrowdemo.mapper.BorrowMapper;
import com.example.borrowdemo.service.BorrowService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowServiceImpl implements BorrowService {

    @Resource
    private BorrowMapper borrowMapper;

    @Override
    public List<User> getUserList() {
        return borrowMapper.getUserList();
    }

    @Override
    public User getUserById(String id) {
        return borrowMapper.getUserById(id);
    }

    @Override
    public void insertUser(User user) {
        borrowMapper.insertUser(user);
    }

    @Override
    public void updateUser(User user) {
        borrowMapper.updateUser(user);
    }

    @Override
    public void deleteUserById(String id) {
        borrowMapper.deleteUserById(id);
    }

}
