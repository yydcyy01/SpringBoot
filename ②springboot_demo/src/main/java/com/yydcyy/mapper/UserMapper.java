package com.yydcyy.mapper;

import com.yydcyy.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author YYDCYY
 * @create 2019-10-13
 */
@Mapper
public interface UserMapper {
    public List<User> queryUserList();
}
