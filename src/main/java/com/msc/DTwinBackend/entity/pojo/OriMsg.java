package com.msc.DTwinBackend.entity.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.entity.pojo
 * @Description: 原始信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("orimsg")
public class OriMsg implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)//在自增主键的变量加上即可
    private int id;

    public String xmlStr;

    @TableField(value = "createTime", fill = FieldFill.INSERT_UPDATE)
    public Date createTime;
}
