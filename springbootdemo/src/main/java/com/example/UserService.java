package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017-3-7.
 */
@Service
public class UserService {
    @Autowired
    private  UserRepository userRepository;

    public void AddNewUser(){
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);
        userRepository.save(new User("aa1", "aa@126.com", "aa", "aa123456",formattedDate));
        userRepository.save(new User("bb2", "bb@126.com", "bb", "bb123456",formattedDate));
        userRepository.save(new User("cc3", "cc@126.com", "cc", "cc123456",formattedDate));


    }
}
