package com.msc.DTwinBackend.controller;

import com.msc.DTwinBackend.entity.pojo.DatabaseTest;
import com.msc.DTwinBackend.mapper.DatabaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.controller
 * @Description: 系统功能测试Controller
 */
@RestController
public class TestController {

    @Autowired
    private DatabaseMapper databaseMapper;
    

    @GetMapping("/mysql")
    public List<DatabaseTest> testMysql() {
        return databaseMapper.findAll();
    }
}
