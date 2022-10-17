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
 * @Description:
 */
@RestController
@CrossOrigin
public class DataDisplayController {

    @Autowired
    private CommonMethod commonMethod;

    @GetMapping("/smallRobotPos")
    public String getSmallRobotPos() {
        return commonMethod.createJsonObject(AssemblyUnitConstant.SMALL_ROBOT_POS);
    }

    @GetMapping("/bigRobotPos")
    public String getBigRobotPos() {
        return commonMethod.createJsonObject(AssemblyUnitConstant.BIG_ROBOT_POS);
    }


}
