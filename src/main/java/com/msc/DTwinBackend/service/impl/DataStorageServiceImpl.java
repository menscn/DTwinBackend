package com.msc.DTwinBackend.service.impl;

import com.msc.DTwinBackend.mapper.OriMsgMapper;
import com.msc.DTwinBackend.service.BigRobotJointService;
import com.msc.DTwinBackend.service.DataStorageService;
import com.msc.DTwinBackend.utils.CommonMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataStorageServiceImpl implements DataStorageService {

    @Autowired
    private BigRobotJointService bigRobotJointService;
    @Autowired
    private CommonMethod commonMethod;

    @Override
    public void allDataStorage() {
        bigRobotJointService.insertData(commonMethod.createBigRobotJointData());
    }
}
