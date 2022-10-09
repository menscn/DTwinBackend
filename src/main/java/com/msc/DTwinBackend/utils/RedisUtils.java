package com.msc.DTwinBackend.utils;

import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPool;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.utils
 * @Description: redis连接池管理，单例模式
 */
@Component
public class RedisUtils {

    private static JedisPool pool = new JedisPool("localhost", 6379);

    private RedisUtils() {
    }

    public static JedisPool getPool() {
        return pool;
    }
}
