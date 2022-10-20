package com.msc.DTwinBackend.handler;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.BackendOfDTAT.handler
 * @Description:
 */

import com.msc.DTwinBackend.entity.pojo.Msg;
import com.msc.DTwinBackend.rabbitmq.SendMsg;
import com.msc.DTwinBackend.utils.ApplicationContextProvider;
import com.msc.DTwinBackend.utils.DataAnalysis;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;
import io.netty.util.CharsetUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * @author
 */
@Slf4j
public class BootNettyUdpSimpleChannelInboundHandler extends SimpleChannelInboundHandler<DatagramPacket> {
    private DataAnalysis dataAnalysis;
    private SendMsg sendMsg;

    public BootNettyUdpSimpleChannelInboundHandler() {
        dataAnalysis = ApplicationContextProvider.getBean(DataAnalysis.class);
        sendMsg = ApplicationContextProvider.getBean(SendMsg.class);
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DatagramPacket msg) throws Exception {
        try {
            String xmlStr = msg.content().toString(CharsetUtil.UTF_8);
            //打印收到的消息
//            log.info("---------------------receive data--------------------------");
            sendMsg.sendMsg(new Msg("ok"));
            dataAnalysis.dataHandler(xmlStr, "Joint");
//            log.info("---------------------ok--------------------------");
        } catch (Exception e) {
        }
    }
}
