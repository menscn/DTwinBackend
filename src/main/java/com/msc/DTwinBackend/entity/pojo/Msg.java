package com.msc.DTwinBackend.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.entity.pojo
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Msg implements Serializable {
    private String xmlStr;

    @Override
    public String toString() {
        return "[  " + " xmlStr = " + xmlStr + " ]";
    }
}
