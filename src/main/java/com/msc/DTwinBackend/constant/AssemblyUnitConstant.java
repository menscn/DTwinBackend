package com.msc.DTwinBackend.constant;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.constant
 * @Description: 简化版信息模型
 */
public class AssemblyUnitConstant {
    public static final String[] CONSTANT = {"BIG_ROBOT_JOINT", "BIG_ROBOT_POS", "SMALL_ROBOT_JOINT",
            "SMALL_ROBOT_POS", "PROGRAM_PROGRESS", "CAMERA", "TIGHTEN_FORCE", "FIXTURE_STATUS", "FIXTURE"};
    public static final String[] ALL = {"A1", "A2", "A3", "A4", "A5", "A6",
            "AA", "AB", "AC", "AX", "AY", "AZ",
            "B1", "B2", "B3", "B4", "B5", "B6",
            "BA", "BB", "BC", "BX", "BY", "BZ",
            "Pro0", "Pro1", "Pro2", "Pro4", "Pro5", "Pro6", "Pro7", "Pro9", "Pro11",
            "CamA", "CamX", "CamY",
            "tForce",
            "FixOpen", "FixClose",
            "Fix1", "Fix2", "Fix3", "Fix4", "Fix5", "Fix6"};
    public static final String[] BIG_ROBOT_JOINT = {"A1", "A2", "A3", "A4", "A5", "A6"};
    public static final String[] BIG_ROBOT_POS = {"AA", "AB", "AC", "AX", "AY", "AZ"};
    public static final String[] SMALL_ROBOT_JOINT = {"B1", "B2", "B3", "B4", "B5", "B6"};
    public static final String[] SMALL_ROBOT_POS = {"BA", "BB", "BC", "BX", "BY", "BZ"};
    public static final String[] PROGRAM_PROGRESS = {"Pro0", "Pro1", "Pro2", "Pro4", "Pro5", "Pro6", "Pro7", "Pro9", "Pro11"};
    public static final String[] CAMERA = {"CamA", "CamX", "CamY"};
    public static final String[] TIGHTEN_FORCE = {"tForce"};
    public static final String[] FIXTURE_STATUS = {"FixOpen", "FixClose"};
    public static final String[] FIXTURE = {"Fix1", "Fix2", "Fix3", "Fix4", "Fix5", "Fix6"};
}
