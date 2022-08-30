package com.msc.DTwinBackend;

import org.dom4j.DocumentException;
import org.junit.jupiter.api.Test;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend
 * @Description: redis缓存测试
 */
public class RedisTest {


    @Test
    public void test() throws DocumentException {
        String xmlStr =
                "<AutoReceiveFromRobotStruct><Joint A1=\"-0.541170\" A2=\"-99.404274\" A3=\"82.003998\" A4=\"-1.155402\" A5=\"108.467812\" A6=\"18.194260\"></Joint><PosAct X=\"803.527222\" Y=\"12.428747\" Z=\"1436.922119\" A=\"-160.900742\" B=\"-0.666547\" C=\"178.620224\"></PosAct><State Bool100=\"0\"></State></AutoReceiveFromRobotStruct>\n";
        String elementStr = "Joint";
        int size = 6;
//        dataExtract.fromStringXml(xmlStr, elementStr, size);
    }

}
