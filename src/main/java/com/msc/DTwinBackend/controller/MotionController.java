package com.msc.DTwinBackend.controller;

import com.msc.DTwinBackend.constant.AssemblyUnitConstant;
import com.msc.DTwinBackend.utils.CommonMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.controller
 * @Description: 前台接口开发
 */

@RestController
@CrossOrigin
public class MotionController {
    @Autowired
    private CommonMethod commonMethod;

    @GetMapping("/all")
    public String getAll() {
        return commonMethod.createJsonObject(AssemblyUnitConstant.ALL);
    }

    @GetMapping("/bigRobotJoint")
    public String getBigRobotJoint() {
        return commonMethod.createJsonObject(AssemblyUnitConstant.BIG_ROBOT_JOINT);
    }

    @GetMapping("/smallRobotJoint")
    public String getSmallRobotJoint() {
        return commonMethod.createJsonObject(AssemblyUnitConstant.SMALL_ROBOT_JOINT);
    }

    @GetMapping("/fixtureType")
    public String getFixtureType() {
        return commonMethod.createJsonObject(AssemblyUnitConstant.FIXTURE_TYPE);
    }

    @GetMapping("/programProgress")
    public String getProgramProgress() {
        return commonMethod.createJsonObject(AssemblyUnitConstant.PROGRAM_PROGRESS);
    }

    @GetMapping("/fixtureStatus")
    public String getFixtureStatus() {
        return commonMethod.createJsonObject(AssemblyUnitConstant.FIXTURE_STATUS);
    }
}
