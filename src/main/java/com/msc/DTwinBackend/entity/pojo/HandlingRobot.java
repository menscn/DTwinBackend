package com.msc.DTwinBackend.entity.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.entity.pojo
 * @Description: 搬运机器人实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class HandlingRobot implements Serializable {
    private double joint_1;
    private double joint_2;
    private double joint_3;
    private double joint_4;
    private double joint_5;
    private double joint_6;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
}
