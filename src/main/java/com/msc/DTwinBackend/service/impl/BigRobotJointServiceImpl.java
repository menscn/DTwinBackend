package com.msc.DTwinBackend.service.impl;

import com.msc.DTwinBackend.entity.pojo.BigRobotJointData;
import com.msc.DTwinBackend.mapper.BigRobotMapper;
import com.msc.DTwinBackend.service.BigRobotJointService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.service.impl
 * @Description: 打机器人关节数据service
 */
@Service
@Slf4j
public class BigRobotJointServiceImpl implements BigRobotJointService {

    @Autowired
    private BigRobotMapper bigRobotMapper;


    @Override
    public List<BigRobotJointData> getAll() {
        return bigRobotMapper.selectList(null);
    }

    @Override
    public void insertData(BigRobotJointData robotJointData) {
        bigRobotMapper.insert(robotJointData);
        log.info("存入数据成功");
    }

    @Override
    public BigRobotJointData getLastData() {
        return bigRobotMapper.selectOne(null);
    }
}
