package com.neo.mapper;

import com.neo.entity.UserEntity;

import java.util.List;

/**
 * Created by Administrator on 2017-3-7.
*/

public interface UserMapper {
    List<UserEntity> getAll();
    UserEntity getOne(Long id);
    void insert(UserEntity user);
    void update(UserEntity user);
    void delete(Long id);
}