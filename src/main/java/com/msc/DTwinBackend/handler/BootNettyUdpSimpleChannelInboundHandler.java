package com.msc.DTwinBackend.handler;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.BackendOfDTAT.handler
 * @Description:
 */

import com.msc.DTwinBackend.mapper.DatabaseMapper;
import com.msc.DTwinBackend.utils.ApplicationContextProvider;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;
import io.netty.util.CharsetUtil;
import lombok.extern.slf4j.Slf4j;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * @author
 */
@Slf4j
public class BootNettyUdpSimpleChannelInboundHandler extends SimpleChannelInboundHandler<DatagramPacket> {
    private DatabaseMapper databaseMapper;

    public BootNettyUdpSimpleChannelInboundHandler() {
        databaseMapper = ApplicationContextProvider.getBean(DatabaseMapper.class);
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DatagramPacket msg) throws Exception {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        try {
            String xmlStr = msg.content().toString(CharsetUtil.UTF_8);
            //打印收到的消息
//            log.info("---------------------receive data--------------------------");
//            log.info(xmlStr);
            String elementStr = "Joint";
            Document document = DocumentHelper.parseText(xmlStr);
            Element rootElement = document.getRootElement();
            Element element = rootElement.element(elementStr);
            List<Attribute> attributes = element.attributes();
            for (Attribute att : attributes) {
                jedis.set(att.getName(), att.getValue());
            }
//            TODO 加入消息队列，异步存入数据库中
//            List<DatabaseTest> all = databaseMapper.findAll();
//            log.info("---------------------receive data--------------------------");
        } catch (Exception e) {
        }
    }
}
