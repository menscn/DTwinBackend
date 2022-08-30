package com.msc.DTwinBackend.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.entity.vo
 * @Description: 前端虚实同步所需实体类，包含两个机器人关节数据，以及相关夹具工件的状态数据
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WebMotion {
    private double bJoint1;
    private double bJoint2;
    private double bJoint3;
    private double bJoint4;
    private double bJoint5;
    private double bJoint6;
    private double sJoint1;
    private double sJoint2;
    private double sJoint3;
    private double sJoint4;
    //    夹具状态码
}
