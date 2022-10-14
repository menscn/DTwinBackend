package com.msc.DTwinBackend.entity.pojo;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.entity.pojo
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("bigrobotjointdata")
@Accessors(chain = true)
public class BigRobotJointData {
    /**
     * ID号
     */
    @ApiModelProperty(name = "ID号", notes = "")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 装配批次号;作为父ID，与主表
     */
    @ApiModelProperty(name = "装配批次号", notes = "作为父ID，与主表")
    private String assemblyBatchId;
    /**
     * 1号关节;大号机器人1号关节转动数据
     */
    @ApiModelProperty(name = "1号关节", notes = "大号机器人1号关节转动数据")
    private String bJoint1;
    /**
     * 2号关节;大号机器人2号关节转动数据
     */
    @ApiModelProperty(name = "2号关节", notes = "大号机器人2号关节转动数据")
    private String bJoint2;
    /**
     * 3号关节;大号机器人3号关节转动数据
     */
    @ApiModelProperty(name = "3号关节", notes = "大号机器人3号关节转动数据")
    private String bJoint3;
    /**
     * 4号关节;大号机器人4号关节转动数据
     */
    @ApiModelProperty(name = "4号关节", notes = "大号机器人4号关节转动数据")
    private String bJoint4;
    /**
     * 5号关节;大号机器人5号关节转动数据
     */
    @ApiModelProperty(name = "5号关节", notes = "大号机器人5号关节转动数据")
    private String bJoint5;
    /**
     * 6号关节;大号机器人6号关节转动数据
     */
    @ApiModelProperty(name = "6号关节", notes = "大号机器人6号关节转动数据")
    private String bJoint6;
    /**
     * 创建时间;数据传入时间
     */

    @ApiModelProperty(name = "创建时间", notes = "数据传入时间")
    @TableField(value = "createTime", fill = FieldFill.INSERT_UPDATE)
    private Date createTime;
}
