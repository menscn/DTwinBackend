package com.msc.DTwinBackend;

import com.msc.DTwinBackend.entity.pojo.DatabaseTest;
import com.msc.DTwinBackend.mapper.DatabaseMapper;
import com.msc.DTwinBackend.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DTwinBackendApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DatabaseMapper databaseMapper;

    @Test
    void contextLoads() {
        List<DatabaseTest> all = databaseMapper.findAll();
        System.out.println(all);

    }
}
