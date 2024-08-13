package com.example.borrowdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
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

    String id;
    String username;
    String password;
    String address;
    String sex;
    String age;
    String birthday;
    String hobby;
    String profile;
    String avatar;
    String telephone;
    String status;

}
