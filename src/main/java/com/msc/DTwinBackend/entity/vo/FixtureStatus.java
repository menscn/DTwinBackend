package com.msc.DTwinBackend.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.entity.vo
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FixtureStatus implements Serializable {
    private String isOpen;

    private String isClose;

}
