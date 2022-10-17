package com.msc.DTwinBackend.utils;

import com.google.gson.JsonObject;
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

    private JsonObject jsonObject;
    private JedisPool pool = redisUtils.getPool();

    @Bean
    public String createJsonObject(String[] keys) {
        jsonObject = new JsonObject();
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
}
