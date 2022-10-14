package com.msc.DTwinBackend.service;

import com.msc.DTwinBackend.entity.pojo.BigRobotJointData;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.service
 * @Description:
 */
@Service
public interface BigRobotJointService {
    List<BigRobotJointData> getAll();

    void insertData(BigRobotJointData robotJointData);

    BigRobotJointData getLastData();
}
