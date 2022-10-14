package com.msc.DTwinBackend.service.impl;

import com.msc.DTwinBackend.constant.IdConstant;
import com.msc.DTwinBackend.entity.pojo.BigRobotJointData;
import com.msc.DTwinBackend.mapper.BigRobotMapper;
import com.msc.DTwinBackend.service.BigRobotJointService;
import com.msc.DTwinBackend.utils.RedisUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

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
    private RedisUtils redisUtils;

    @Autowired
    private BigRobotMapper bigRobotMapper;


    @Override
    public List<BigRobotJointData> getAll() {
        return bigRobotMapper.selectList(null);
    }

    @Override
    public void insertData(BigRobotJointData robotJointData) {
        BigRobotJointData jointData = new BigRobotJointData();
        try (JedisPool pool = redisUtils.getPool()) {
            Jedis jedis = pool.getResource();
            jointData.setBJoint1(jedis.get("A1")).setBJoint2(jedis.get("A2")).setBJoint3(jedis.get("A3")).
                    setBJoint4(jedis.get("A4")).setBJoint5(jedis.get("A5")).setBJoint6(jedis.get("A6"));
            jointData.setAssemblyBatchId(IdConstant.getMysqlId().get("id"));
        }
        bigRobotMapper.insert(jointData);
    }

    @Override
    public BigRobotJointData getLastData() {
        return bigRobotMapper.selectOne(null);
    }
}
