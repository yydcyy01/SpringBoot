package com.yydcyy.test;

import com.yydcyy.SpringBootMyBatisApplication;
import com.yydcyy.domain.User;
import com.yydcyy.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author YYDCYY
 * @create 2019-10-13
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootMyBatisApplication.class)
public class MybatisTest {

    //测谁, 注入谁
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        List<User> users = userMapper.queryUserList();
        System.out.println(users);
    }
}