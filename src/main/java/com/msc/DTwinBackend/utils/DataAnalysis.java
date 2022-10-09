package com.msc.DTwinBackend.utils;

import lombok.extern.slf4j.Slf4j;
import org.dom4j.*;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.List;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.utils
 * @Description: 平台xml解析
 */
@Component
@Slf4j
public class DataAnalysis {
    private RedisUtils redisUtils;

    public DataAnalysis() {
        redisUtils = ApplicationContextProvider.getBean(RedisUtils.class);
    }

    public void dataHandler(String xmlStr, String elementStr) throws DocumentException {
        Document document = DocumentHelper.parseText(xmlStr);
        Element rootElement = document.getRootElement();
        Element element = rootElement.element(elementStr);
        List<Attribute> attributes = element.attributes();
        try (JedisPool pool = redisUtils.getPool()) {
            log.info("---------------------redis接收数据--------------------------");
            Jedis jedis = pool.getResource();
            for (Attribute att : attributes) {
                jedis.set(att.getName(), att.getValue());
            }
        }
    }
}
