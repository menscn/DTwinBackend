package com.msc.DTwinBackend.entity.pojo;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@ApiModel(value = "装配过程全数据", description = "")
@TableName("AssemblyProcessDatabase")
public class AssemblyProcessDatabase {
    /**
     * id
     */
    @ApiModelProperty(name = "ID号", notes = "")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 装配批次号;装配批次ID
     */
    @ApiModelProperty(name = "装配批次号", notes = "装配批次ID")
    private String assemblyBatchId;
    /**
     * 创建时间;数据传入时间
     */
    @ApiModelProperty(name = "创建时间", notes = "数据传入时间")
    @TableField(value = "createTime", fill = FieldFill.INSERT_UPDATE)
    private Date createTime;
}
