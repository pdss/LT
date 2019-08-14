package com.st.lt.mapper;

import com.st.lt.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: luotao
 * @CreateTime: 2019-08-12 00:30
 * @Description:
 */
@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> getUsers();
}
