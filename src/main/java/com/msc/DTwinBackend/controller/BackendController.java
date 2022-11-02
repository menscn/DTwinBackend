package com.msc.DTwinBackend.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.msc.DTwinBackend.entity.pojo.BigRobotJointData;
import com.msc.DTwinBackend.entity.pojo.OriMsg;
import com.msc.DTwinBackend.entity.pojo.SmallRobotJointData;
import com.msc.DTwinBackend.mapper.BigRobotMapper;
import com.msc.DTwinBackend.mapper.OriMsgMapper;
import com.msc.DTwinBackend.mapper.SmallRobotMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.controller
 * @Description: 后台接口开发
 */
@RestController
@CrossOrigin
@Slf4j
public class BackendController {

    @Autowired
    private SmallRobotMapper smallRobotMapper;
    @Autowired
    private OriMsgMapper oriMsgMapper;
    @Autowired
    private BigRobotMapper bigRobotMapper;

    @GetMapping("/smallRobotData")
    public List<SmallRobotJointData> getSmallRobotData() {
        return smallRobotMapper.selectList(null);
    }

    @RequestMapping("/deleteById/{id}")
    public int deleteById(@PathVariable("id") int id) {
        return oriMsgMapper.deleteById(id);
    }

    @GetMapping("/oriMsg")
    public List<OriMsg> getOriMsg() {
        return oriMsgMapper.selectList(null);
    }

    @RequestMapping("/getSmallRobotDataByPage/{pageIndex}/{pageSize}")
    public Page<BigRobotJointData> getSmallRobotDataByPage(@PathVariable("pageIndex") int pageIndex, @PathVariable("pageSize") int pageSize) {
        Page<BigRobotJointData> userPage = new Page<>(pageIndex, pageSize);
        Page<BigRobotJointData> page = bigRobotMapper.selectPage(userPage, null);
        return page;
    }

    @RequestMapping("getOriMsgByPage/{pageIndex}/{pageSize}")
    public Page<OriMsg> getOriMsgByPage(@PathVariable("pageIndex") int pageIndex, @PathVariable("pageSize") int pageSize) {
        Page<OriMsg> userPage = new Page<>(pageIndex, pageSize);
        Page<OriMsg> page = oriMsgMapper.selectPage(userPage, null);
        return page;
    }
}
