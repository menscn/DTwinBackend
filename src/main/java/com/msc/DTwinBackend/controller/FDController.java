package com.msc.DTwinBackend.controller;

import com.google.gson.JsonObject;
import com.msc.DTwinBackend.constant.AssemblyUnitConstant;
import com.msc.DTwinBackend.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@RestController
@CrossOrigin
public class FDController {
    @Autowired
    private RedisUtils redisUtils;

    private JsonObject jsonObject;
    private JedisPool pool = redisUtils.getPool();

    @GetMapping("/all")
    public String getAll() {
        jsonObject = new JsonObject();
        Jedis jedis = pool.getResource();
        try {

            for (String key : AssemblyUnitConstant.ALL) {
                jsonObject.addProperty(key, jedis.get(key));
            }
        } finally {
            jedis.close();
        }
        return jsonObject.toString();
    }

    @GetMapping("/bigRobotJoint")
    public String getBigRobotJoint() {
        jsonObject = new JsonObject();
        Jedis jedis = pool.getResource();
        try {
            for (String key : AssemblyUnitConstant.BIG_ROBOT_JOINT) {
                jsonObject.addProperty(key, jedis.get(key));
            }
        } finally {
            jedis.close();
        }
        return jsonObject.toString();
    }

    @GetMapping("/smallRobotJoint")
    public String getSmallRobotJoint() {
        jsonObject = new JsonObject();
        Jedis jedis = pool.getResource();
        try {
            for (String key : AssemblyUnitConstant.SMALL_ROBOT_JOINT) {
                jsonObject.addProperty(key, jedis.get(key));
            }
        } finally {
            jedis.close();
        }
        return jsonObject.toString();
    }

    @GetMapping("/smallRobotPos")
    public String getSmallRobotPos() {
        jsonObject = new JsonObject();
        Jedis jedis = pool.getResource();
        try {
            for (String key : AssemblyUnitConstant.SMALL_ROBOT_POS) {
                jsonObject.addProperty(key, jedis.get(key));
            }
        } finally {
            jedis.close();
        }
        return jsonObject.toString();
    }

    @GetMapping("/bigRobotPos")
    public String getbigRobotPos() {
        jsonObject = new JsonObject();
        Jedis jedis = pool.getResource();
        try {
            for (String key : AssemblyUnitConstant.BIG_ROBOT_POS) {
                jsonObject.addProperty(key, jedis.get(key));
            }
        } finally {
            jedis.close();
        }
        return jsonObject.toString();
    }
}
