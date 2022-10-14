package com.msc.DTwinBackend.rabbitmq;

import com.msc.DTwinBackend.config.RabbitMsgConvertConfigure;
import com.msc.DTwinBackend.entity.pojo.Msg;
import com.msc.DTwinBackend.entity.pojo.OriMsg;
import com.msc.DTwinBackend.mapper.OriMsgMapper;
import com.msc.DTwinBackend.service.BigRobotJointService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.rabbitmq
 * @Description: rabbitmq消息接收
 */
@Component
@Slf4j
// @RabbitListener除了可以作用在方法，也可以作用在类上。在后者的情况下，需要在处理的方法使用@RabbitHandler。一个类可以配置多个@RabbitHandler
@RabbitListener(queues = RabbitMsgConvertConfigure.SPRING_BOOT_QUEUE)
public class ReceiveMsg {
    @Autowired
    private OriMsgMapper oriMsgMapper;
    @Autowired
    private BigRobotJointService bigRobotJointService;

    @RabbitHandler
    public void receiveOriMsg(OriMsg oriMsg) {
        // ...
        log.info("---------------------消息队列接收到数据--------------------------");
        System.out.println("[ReceiveMsgConvertMsg-MsgContent2] receive receiveMsgContent2 msg: " + oriMsg);
    }

    @RabbitHandler
    public void receiveMsg(Msg msg) {
        // ...
        log.info("---------------------消息队列接收到数据--------------------------");
        System.out.println("[ReceiveMsgConvertMsg-MsgContent2] receive receiveMsgContent2 msg: " + msg);
        OriMsg oriMsg = new OriMsg();
        oriMsg.setXmlStr(msg.getXmlStr());
        oriMsgMapper.insert(oriMsg);
        System.out.println("[ReceiveMsgConvertMsg-MsgContent2] receive receiveMsgContent2 msg: " + oriMsg);
        log.info("+++++数据存储成功-");
//        BigRobotJointData objFromRedis = bigRobotJointService.getObjFromRedis();
//        log.info("objFromRedis" + objFromRedis.getBJoint1());
    }
//    @RabbitHandler
//    public void receiveString(@Payload String content) {
//        // ...
//        System.out.println("[ReceiveMsgConvertMsg-MsgContent2] receive msg: " + content);
//    }
//
//    @RabbitHandler
//    public void receiveStringb(byte[] content) {
//        // ...
//        System.out.println("[ReceiveMsgConvertMsg-MsgContent2] receive msg: " + content);
//    }
}
