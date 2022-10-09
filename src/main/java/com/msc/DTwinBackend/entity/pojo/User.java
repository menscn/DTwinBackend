package com.msc.DTwinBackend.entity.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.entity.pojo
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("user")
public class User {
    public int id;
    public String username;
    public String password;
    public String email;
}
