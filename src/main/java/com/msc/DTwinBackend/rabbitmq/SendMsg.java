package com.msc.DTwinBackend.rabbitmq;

import com.msc.DTwinBackend.config.RabbitMsgConvertConfigure;
import com.msc.DTwinBackend.entity.pojo.Msg;
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

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendOriMsg(OriMsg oriMsg) {
        amqpTemplate.convertAndSend(RabbitMsgConvertConfigure.SPRING_BOOT_EXCHANGE, RabbitMsgConvertConfigure.SPRING_BOOT_BIND_KEY, oriMsg);
    }

    public void sendMsg(Msg msg) {
        amqpTemplate.convertAndSend(RabbitMsgConvertConfigure.SPRING_BOOT_EXCHANGE, RabbitMsgConvertConfigure.SPRING_BOOT_BIND_KEY, msg);
    }
}
