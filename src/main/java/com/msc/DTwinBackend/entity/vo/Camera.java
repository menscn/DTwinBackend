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
public class Camera implements Serializable {
    private String CamA;

    private String CamX;

    private String CamY;
}
