package com.msc.DTwinBackend.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.entity.pojo
 * @Description: mybatis测试实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int id;

    private String username;

    private String password;

    private String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
