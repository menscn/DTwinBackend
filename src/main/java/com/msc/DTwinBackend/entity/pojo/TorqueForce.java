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
@ApiModel(value = "扭紧力", description = "")
@TableName("TorqueForce")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TorqueForce implements Serializable {
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
     * 固定RXJT与GDT的1号螺钉
     */
    @ApiModelProperty(name = "固定RXJT与GDT的1号螺钉", notes = "")
    private String rxjtGdt01;
    /**
     * 固定RXJT与GDT的2号螺钉
     */
    @ApiModelProperty(name = "固定RXJT与GDT的2号螺钉", notes = "")
    private String rxjtGdt02;
    /**
     * 固定RXJT与GDT的3号螺钉
     */
    @ApiModelProperty(name = "固定RXJT与GDT的3号螺钉", notes = "")
    private String rxjtGdt03;
    /**
     * 固定RXJT与GDT的4号螺钉
     */
    @ApiModelProperty(name = "固定RXJT与GDT的4号螺钉", notes = "")
    private String rxjtGdt04;
    /**
     * 固定RXJT与GDT的5号螺钉
     */
    @ApiModelProperty(name = "固定RXJT与GDT的5号螺钉", notes = "")
    private String rxjtGdt05;
    /**
     * 固定BHGD与GDT的1号螺钉
     */
    @ApiModelProperty(name = "固定BHGD与GDT的1号螺钉", notes = "")
    private String gdtBhgd01;
    /**
     * 固定BHGD与GDT的2号螺钉
     */
    @ApiModelProperty(name = "固定BHGD与GDT的2号螺钉", notes = "")
    private String gdtBhgd02;
    /**
     * 固定BHGD与GDT的3号螺钉
     */
    @ApiModelProperty(name = "固定BHGD与GDT的3号螺钉", notes = "")
    private String gdtBhgd03;
    /**
     * 固定BHGD与GDT的4号螺钉
     */
    @ApiModelProperty(name = "固定BHGD与GDT的4号螺钉", notes = "")
    private String gdtBhgd04;
    /**
     * 固定BHGD与GDT的5号螺钉
     */
    @ApiModelProperty(name = "固定BHGD与GDT的5号螺钉", notes = "")
    private String gdtBhgd05;
    /**
     * 固定RXJT与KZD的1号螺钉
     */
    @ApiModelProperty(name = "固定RXJT与KZD的1号螺钉", notes = "")
    private String rxjtKzd01;
    /**
     * 固定RXJT与KZD的2号螺钉
     */
    @ApiModelProperty(name = "固定RXJT与KZD的2号螺钉", notes = "")
    private String rxjtKzd02;
    /**
     * 固定RXJT与KZD的3号螺钉
     */
    @ApiModelProperty(name = "固定RXJT与KZD的3号螺钉", notes = "")
    private String rxjtKzd03;
    /**
     * 固定RXJT与KZD的4号螺钉
     */
    @ApiModelProperty(name = "固定RXJT与KZD的4号螺钉", notes = "")
    private String rxjtKzd04;
    /**
     * 固定RXJT与KZD的5号螺钉
     */
    @ApiModelProperty(name = "固定RXJT与KZD的5号螺钉", notes = "")
    private String rxjtKzd05;
    /**
     * 创建时间
     */
    @ApiModelProperty(name = "创建时间", notes = "数据传入时间")
    @TableField(value = "createTime", fill = FieldFill.INSERT_UPDATE)
    private Date createTime;
}
