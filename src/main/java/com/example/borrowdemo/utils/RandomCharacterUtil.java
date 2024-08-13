package com.example.borrowdemo.utils;

import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.UUID;

@Component
public class RandomCharacterUtil {


    public static void main(String[] args) {
        RandomCharacterUtil randomCharacterUtil = new RandomCharacterUtil();
        System.out.println(randomCharacterUtil.getUserNameRandomCharacterDemo());

    }

    public String getUserIdRandomCharacterDemo() {

        String id = "user:id:" + UUID.randomUUID().toString().replace("-", "").substring(0, 10);

        return id;
    }


    public String getUserNameRandomCharacterDemo() {

        String username = "user:username:" + UUID.randomUUID().toString().replace("-", "").substring(0, 10);

        return username;
    }


    public String getUserPasswordRandomCharacterDemo() {

        String password = "user:password:" + UUID.randomUUID().toString().replace("-", "").substring(0, 10);

        return password;
    }

    public String getUserAddressRandomCharacterDemo() {

        String address = "user:address:" + UUID.randomUUID().toString().replace("-", "").substring(0, 10);

        return address;
    }

    public String getUserSexRandomCharacterDemo() {

        String sex = "user:sex:" + new Random().nextInt(2);

        return sex;
    }

    public String getUserAgeRandomCharacterDemo() {

        String age = "user:age:" + new Random().nextInt(100);

        return age;
    }

    public String getUserBirthdayRandomCharacterDemo() {

        String birthday = "user:birthday:" + new Random().nextInt(100);

        return birthday;
    }


    public String getUserHobbyRandomCharacterDemo() {

        String hobby = "user:hobby:" + new Random().nextInt(100);

        return hobby;
    }


    public String getUserProfileRandomCharacterDemo() {

        String profile = "user:profile:" + new Random().nextInt(100);

        return profile;
    }

    public String getUserAvatarRandomCharacterDemo() {

        String avatar = "user:avatar:" + new Random().nextInt(100);

        return avatar;
    }


    public String getUserTelephoneRandomCharacterDemo() {

        String telephone = "user:telephone:" + new Random().nextInt(100);

        return telephone;
    }

    public String getUserStatusRandomCharacterDemo() {

        String status = "user:status:" + new Random().nextInt(2);

        return status;
    }



//    public String getBookRandomCharacterDemo() {
//
//        String id = "book:" + UUID.randomUUID().toString().replace("-", "").substring(0, 19);
//
//        return id;
//    }

}
