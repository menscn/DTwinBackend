package com.msc.DTwinBackend.constant;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.constant
 * @Description:
 */
public class GlobalMap {
    private static final ConcurrentHashMap<String, String> NAME_CONVERSION = new ConcurrentHashMap<>();

    static {
        NAME_CONVERSION.put("A1", "bJoint1");
        NAME_CONVERSION.put("A2", "bJoint2");
        NAME_CONVERSION.put("A3", "bJoint3");
        NAME_CONVERSION.put("A4", "bJoint4");
        NAME_CONVERSION.put("A5", "bJoint5");
        NAME_CONVERSION.put("A6", "bJoint6");
    }

    public static final String[] ALL = {"A1", "A2", "A3", "A4", "A5", "A6",
            "AA", "AB", "AC", "AX", "AY", "AZ",
            "B1", "B2", "B3", "B4", "B5", "B6",
            "BA", "BB", "BC", "BX", "BY", "BZ",
            "Pro0", "Pro1", "Pro2", "Pro4", "Pro5", "Pro6", "Pro7", "Pro9", "Pro11",
            "CamA", "CamX", "CamY",
            "tForce",
            "FixOpen", "FixClose",
            "Fix1", "Fix2", "Fix3", "Fix4", "Fix5", "Fix6"};

    private GlobalMap() {
    }
}
