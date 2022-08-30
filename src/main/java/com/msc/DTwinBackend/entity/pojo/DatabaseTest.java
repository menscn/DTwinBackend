package com.msc.DTwinBackend.entity.pojo;

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
public class DatabaseTest {
    private int id;
    private String batchId;
    private String value;
    private Date createTime;
}
