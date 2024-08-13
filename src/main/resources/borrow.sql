
create database if not exists borrow;

use borrow;

drop table if exists  users;

create table if not exists users(
    id varchar(100) not null unique,
    username varchar(100) not null unique ,
    password varchar(100) not null,
    address varchar(100),
    sex varchar(100) not null default '0' comment '0-male 1-female',
    age varchar(100),
    birthday varchar(100),
    hobby varchar(100),
    profile varchar(100),
    avatar varchar(100),
    telephone varchar(100) not null default '0',
    status varchar(100) not null default '1' comment '0-normal 1-abnormal');


insert into users (
    id,
    username,
    password,
    address,
    sex,
    age,
    birthday,
    hobby,
    profile,
    avatar,
    telephone,
    status)
values
    ('1','1','1','','1','10','1995-09-08','','','','1','1');


create table if not exists books(
    id varchar(100) not null unique,
    title varchar(100) not null unique ,
    topic varchar(1000),
    category varchar(100),
    author varchar(100) not null default 'Anonymous',
    publishTime varchar(100),
    createTime varchar(100),
    showTime varchar(100),
    stock varchar(5),
    status varchar(2) not null default '0' comment '0-normal 1-abnormal',
    price varchar(10) not null default '0');


insert into books (
    id,
    title,
    topic,
    category,
    author,
    publishTime,
    createTime,
    showTime,
    stock,
    status,
    price)
values
    ('1','1','1','1','1','1987-09-07','1995-09-08','2024-08-16','100','0','19.99');