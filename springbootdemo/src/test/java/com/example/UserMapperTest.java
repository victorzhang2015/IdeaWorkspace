package com.example;

import com.neo.entity.UserEntity;
import com.neo.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Administrator on 2017-3-7.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper UserMapper;

    @Test
    public void testInsert() throws Exception {
        UserMapper.insert(new UserEntity("aa", "a123456", "man"));
        UserMapper.insert(new UserEntity("bb", "b123456", "woman"));
        UserMapper.insert(new UserEntity("cc", "b123456", "woman"));

        Assert.assertEquals(3, UserMapper.getAll().size());
    }

    @Test
    public void testQuery() throws Exception {
        List<UserEntity> users = UserMapper.getAll();
        System.out.println(users.toString());
    }

    @Test
    public void testUpdate() throws Exception {
        UserEntity user = UserMapper.getOne(8L);
        System.out.println(user.toString());
        user.setNickName("neo");
        UserMapper.update(user);
        Assert.assertTrue(("neo".equals(UserMapper.getOne(8L).getNickName())));
    }
}