package com.msc.DTwinBackend.utils;

import com.google.gson.JsonObject;
import com.msc.DTwinBackend.constant.AssemblyUnitConstant;
import com.msc.DTwinBackend.constant.IdConstant;
import com.msc.DTwinBackend.entity.pojo.BigRobotJointData;
import com.msc.DTwinBackend.entity.vo.BigRobotJoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.utils
 * @Description:
 */
@Component
public class CommonMethod {
    @Autowired
    private RedisUtils redisUtils;

    private JedisPool pool = redisUtils.getPool();

    public String createJsonObject(String[] keys) {
        JsonObject jsonObject = new JsonObject();
        Jedis jedis = pool.getResource();
        try {
            for (String key : keys) {
                jsonObject.addProperty(key, jedis.get(key));
            }
        } finally {
            jedis.close();
        }
        return jsonObject.toString();
    }

    public BigRobotJointData createBigRobotJointData() {
        JsonObject jsonObject = new JsonObject();
        BigRobotJointData robotJointData = new BigRobotJointData();
        robotJointData.setAssemblyBatchId(IdConstant.getMysqlId().get("id"));
        Jedis jedis = pool.getResource();
        try {
            robotJointData.setBJoint1(jedis.get("A1"));
            robotJointData.setBJoint2(jedis.get("A2"));
            robotJointData.setBJoint3(jedis.get("A3"));
            robotJointData.setBJoint4(jedis.get("A4"));
            robotJointData.setBJoint5(jedis.get("A5"));
            robotJointData.setBJoint6(jedis.get("A6"));
        } finally {
            jedis.close();
        }
        return robotJointData;
    }
}
