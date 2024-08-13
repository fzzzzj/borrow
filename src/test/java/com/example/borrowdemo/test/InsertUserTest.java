package com.example.borrowdemo.test;

import com.example.borrowdemo.entity.User;
import com.example.borrowdemo.service.impl.BorrowServiceImpl;
import com.example.borrowdemo.utils.RandomCharacterUtil;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InsertUserTest {

    @Resource
    private BorrowServiceImpl borrowServiceImpl;

    @Resource
    private RandomCharacterUtil randomCharacterUtil;

    @Test
    public void insertUserTestDemo() {

        /*
        id varchar(20) not null unique,
        username varchar(20) not null unique ,
        password varchar(20) not null,
        address varchar(100),
        sex varchar(10) not null default '0' comment '0-male 1-female',
        age varchar(10),
        birthday varchar(20),
        hobby varchar(100),
        profile varchar(1000),
        avatar varchar(1000),
        telephone varchar(20) not null default '0',
        status varchar(2) not null default '1' comment '0-normal 1-abnormal'
        * */

        for (int i = 0; i < 100; i++) {

            User user = new User();
            user.setId(randomCharacterUtil.getUserIdRandomCharacterDemo());
            user.setUsername(randomCharacterUtil.getUserNameRandomCharacterDemo());
            user.setPassword(randomCharacterUtil.getUserPasswordRandomCharacterDemo());
            user.setAddress(randomCharacterUtil.getUserAddressRandomCharacterDemo());
            user.setSex(randomCharacterUtil.getUserSexRandomCharacterDemo());
            user.setAge(randomCharacterUtil.getUserAgeRandomCharacterDemo());
            user.setBirthday(randomCharacterUtil.getUserBirthdayRandomCharacterDemo());
            user.setHobby(randomCharacterUtil.getUserHobbyRandomCharacterDemo());
            user.setProfile(randomCharacterUtil.getUserProfileRandomCharacterDemo());
            user.setAvatar(randomCharacterUtil.getUserAvatarRandomCharacterDemo());
            user.setTelephone(randomCharacterUtil.getUserTelephoneRandomCharacterDemo());
            user.setStatus(randomCharacterUtil.getUserStatusRandomCharacterDemo());

            borrowServiceImpl.insertUser(user);

        }


    }

}
