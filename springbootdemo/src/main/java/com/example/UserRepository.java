package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017-3-7.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username, String email);
}