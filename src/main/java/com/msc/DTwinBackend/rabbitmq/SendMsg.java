package com.msc.DTwinBackend.rabbitmq;

import com.msc.DTwinBackend.config.RabbitMsgConvertConfigure;
import com.msc.DTwinBackend.entity.pojo.Msg;
import com.msc.DTwinBackend.entity.pojo.MsgContent1;
import com.msc.DTwinBackend.entity.pojo.MsgContent2;
import com.msc.DTwinBackend.entity.pojo.OriMsg;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.rabbitmq
 * @Description: rabbitmq发送
 */
@Component
public class SendMsg {
    // 此接口的默认实现是RabbitTemplate，目前只有一个实现，
    @Autowired
    private AmqpTemplate amqpTemplate;

    /**
     * 发送消息
     *
     * @param msgContent
     */
    public void sendMsgContent1(MsgContent1 msgContent) {
        amqpTemplate.convertAndSend(RabbitMsgConvertConfigure.SPRING_BOOT_EXCHANGE, RabbitMsgConvertConfigure.SPRING_BOOT_BIND_KEY, msgContent);


    }

    /**
     * 发送消息
     *
     * @param msgContent
     */
    public void sendMsgContent2(MsgContent2 msgContent) {
        amqpTemplate.convertAndSend(RabbitMsgConvertConfigure.SPRING_BOOT_EXCHANGE, RabbitMsgConvertConfigure.SPRING_BOOT_BIND_KEY, msgContent);
    }

    public void sendOriMsg(OriMsg oriMsg) {
        amqpTemplate.convertAndSend(RabbitMsgConvertConfigure.SPRING_BOOT_EXCHANGE, RabbitMsgConvertConfigure.SPRING_BOOT_BIND_KEY, oriMsg);
    }

    public void sendMsg(Msg msg) {
        amqpTemplate.convertAndSend(RabbitMsgConvertConfigure.SPRING_BOOT_EXCHANGE, RabbitMsgConvertConfigure.SPRING_BOOT_BIND_KEY, msg);
    }
}
