package com.msc.DTwinBackend.controller;

import com.msc.DTwinBackend.entity.pojo.User;
import com.msc.DTwinBackend.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.controller
 * @Description:
 */
@RestController
public class TestController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("test")
    public List<User> test() {
        return userMapper.selectList(null);
    }
}
