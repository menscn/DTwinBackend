package com.msc.DTwinBackend.constant;

import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.constant
 * @Description:
 */

@Component
public class IdConstant {
    private static final ConcurrentHashMap<String, String> MYSQL_ID = new ConcurrentHashMap<>();

    private IdConstant() {
    }

    public static ConcurrentHashMap<String, String> getMysqlId() {
        return MYSQL_ID;
    }
}
