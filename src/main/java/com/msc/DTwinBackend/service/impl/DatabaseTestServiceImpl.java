package com.msc.DTwinBackend.service.impl;

import com.msc.DTwinBackend.mapper.DatabaseMapper;
import com.msc.DTwinBackend.service.DatabaseTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.service.impl
 * @Description:
 */
@Service
public class DatabaseTestServiceImpl implements DatabaseTestService {
    @Autowired
    DatabaseMapper databaseMapper;

    @Override
    public String findAll() {
        databaseMapper.findAll();
        return "ok";
    }
}
