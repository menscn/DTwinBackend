package com.msc.DTwinBackend.mapper;

import com.msc.DTwinBackend.entity.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.mapper
 * @Description:
 */
@Mapper
@Repository
public interface UserMapper {

    //添加用户
    int addUser(User user);

    //删除用户
    int deleteUserById(int id);

    //查询用户（根据id）
    User queryUserById(int id);

    //查询全部用户
    List<User> queryAllUser();

    //修改用户
    int updateUser(User user);
}
