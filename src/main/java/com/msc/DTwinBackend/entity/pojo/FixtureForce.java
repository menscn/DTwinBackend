package com.msc.DTwinBackend.entity.pojo;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.entity.pojo
 * @Description:
 */
@ApiModel(value = "装配夹具力", description = "")
@TableName("FixtureForce")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class FixtureForce implements Serializable {
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
     * 1号夹具
     */
    @ApiModelProperty(name = "1号夹具", notes = "")
    private String fixture1;
    /**
     * 156号夹具
     */
    @ApiModelProperty(name = "156号夹具", notes = "")
    private String fixture156;
    /**
     * 170夹具
     */
    @ApiModelProperty(name = "170夹具", notes = "")
    private String fixture170;
    /**
     * 218夹具
     */
    @ApiModelProperty(name = "218夹具", notes = "")
    private String fixture218;
    /**
     * 360夹具
     */
    @ApiModelProperty(name = "360夹具", notes = "")
    private String fixture360;
    /**
     * 322夹具
     */
    @ApiModelProperty(name = "322夹具", notes = "")
    private String fixture322;
    /**
     * 创建时间
     */
    @ApiModelProperty(name = "创建时间", notes = "数据传入时间")
    @TableField(value = "createTime", fill = FieldFill.INSERT_UPDATE)
    private Date createTime;
}
