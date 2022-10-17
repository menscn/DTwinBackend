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
public class SmallRobot implements Serializable {

    private String sJoint1;

    private String sJoint2;

    private String sJoint3;

    private String sJoint4;

    private String sJoint5;

    private String sJoint6;
}
