package com.msc.DTwinBackend.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.entity.vo
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BigRobotJoint implements Serializable {

    private String bJoint1;

    private String bJoint2;

    private String bJoint3;

    private String bJoint4;

    private String bJoint5;

    private String bJoint6;
}
