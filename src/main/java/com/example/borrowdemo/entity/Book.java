package com.example.borrowdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {

    /*
    id varchar(20) not null unique,
    title varchar(100) not null unique ,
    topic varchar(1000),
    category varchar(100),
    author varchar(100) not null default 'Anonymous',
    publishTime varchar(20),
    createTime varchar(20),
    showTime varchar(20),
    stock varchar(5),
    status varchar(2) not null default '0' comment '0-normal 1-abnormal',
    price varchar(10) not null default '0'
    * */

    String id;
    String title;
    String topic;
    String category;
    String author;
    String publishTime;
    String createTime;
    String showTime;
    String stock;
    String status;
    String price;

}
