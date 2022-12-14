package com.msc.DTwinBackend;

import com.msc.DTwinBackend.constant.IdConstant;
import com.msc.DTwinBackend.entity.pojo.AssemblyProcessDatabase;
import com.msc.DTwinBackend.entity.pojo.OriMsg;
import com.msc.DTwinBackend.mapper.*;
import com.msc.DTwinBackend.rabbitmq.SendMsg;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class DTwinBackendApplicationTests {
    @Autowired
    private SendMsg sendMsgConvertMsg;
    @Autowired
    private OriMsgMapper oriMsgMapper;
    @Autowired
    private BigRobotMapper bigRobotMapper;
    @Autowired
    private SmallRobotMapper smallRobotMapper;
    @Autowired
    private FixtureForceMapper fixtureForceMapper;
    @Autowired
    private TorqueForceMapper torqueForceMapper;
    @Autowired
    private AssemblyProcessDatabaseMapper databaseMapper;

    @Test
    public void sendMsgContent() throws Exception {

        OriMsg oriMsg = new OriMsg();
        oriMsg.setId(1);
        String xml = "<AutoReceiveFromRobotStruct><Joint A1=\"-0.541170\" A2=\"-99.404274\" A3=\"82.003998\" A4=\"-1.155402\" A5=\"108.467812\" A6=\"18.194260\"></Joint><PosAct X=\"803.527222\" Y=\"12.428747\" Z=\"1436.922119\" A=\"-160.900742\" B=\"-0.666547\" C=\"178.620224\"></PosAct><State Bool100=\"0\"></State></AutoReceiveFromRobotStruct>\n";
        oriMsg.setXmlStr(xml);
        sendMsgConvertMsg.sendOriMsg(oriMsg);

    }

    @Test
    public void test() {
        OriMsg oriMsg = new OriMsg();
        /*oriMsg.setXmlStr("msc");*/
        String xml = "<AutoReceiveFromRobotStruct><Joint ";
        oriMsg.setXmlStr(xml);
        oriMsgMapper.insert(oriMsg);
        Date date = new Date();
    }

    @Autowired
    private IdConstant idConstant;

    @Test
    public void testMysql() {
        AssemblyProcessDatabase database = new AssemblyProcessDatabase();
        database.setAssemblyBatchId("20201017");
        databaseMapper.insert(database);
    }
}
