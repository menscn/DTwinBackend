package com.msc.DTwinBackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.msc.DTwinBackend.entity.pojo.SmallRobotJointData;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.mapper
 * @Description:
 */
@Mapper
public interface SmallRobotMapper extends BaseMapper<SmallRobotJointData> {
}
