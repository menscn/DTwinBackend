package com.msc.DTwinBackend.entity.pojo;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.entity.pojo
 * @Description:
 */
@TableName("SmallRobotJointData")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class SmallRobotJointData implements Serializable {
    /**
     * ID号
     */
    @ApiModelProperty(name = "ID号", notes = "")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 装配批次号
     */
    @ApiModelProperty(name = "装配批次号", notes = "")
    private String assemblyBatchId;
    /**
     * 1号关节
     */
    @ApiModelProperty(name = "1号关节", notes = "")
    private String sJoint1;
    /**
     * 2号关节
     */
    @ApiModelProperty(name = "2号关节", notes = "")
    private String sJoint2;
    /**
     * 3号关节
     */
    @ApiModelProperty(name = "3号关节", notes = "")
    private String sJoint3;
    /**
     * 4号关节
     */
    @ApiModelProperty(name = "4号关节", notes = "")
    private String sJoint4;
    /**
     * 5号关节
     */
    @ApiModelProperty(name = "5号关节", notes = "")
    private String sJoint5;
    /**
     * 6号关节
     */
    @ApiModelProperty(name = "6号关节", notes = "")
    private String sJoint6;
    /**
     * 创建时间
     */
    @ApiModelProperty(name = "创建时间", notes = "数据传入时间")
    @TableField(value = "createTime", fill = FieldFill.INSERT_UPDATE)
    private Date createTime;
}
