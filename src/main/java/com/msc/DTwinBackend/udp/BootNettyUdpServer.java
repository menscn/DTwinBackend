package com.msc.DTwinBackend.udp;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.BackendOfDTAT.udp
 * @Description:
 */


import com.msc.DTwinBackend.handler.BootNettyUdpSimpleChannelInboundHandler;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioDatagramChannel;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BootNettyUdpServer {
    /**
     * 启动服务
     */
    public void bind(int port) {
        log.info("-------------------------------udpServer-------------------------");
        //表示服务器连接监听线程组，专门接受 accept 新的客户端client 连接
        EventLoopGroup bossLoopGroup = new NioEventLoopGroup();
        try {
            //1，创建netty bootstrap 启动类
            Bootstrap serverBootstrap = new Bootstrap();
            //2、设置boostrap 的eventLoopGroup线程组
            serverBootstrap = serverBootstrap.group(bossLoopGroup);
            //3、设置NIO UDP连接通道
            serverBootstrap = serverBootstrap.channel(NioDatagramChannel.class);
            //4、设置通道参数 SO_BROADCAST广播形式
            serverBootstrap = serverBootstrap.option(ChannelOption.SO_BROADCAST, true);
            //5、设置处理类 装配流水线
            serverBootstrap = serverBootstrap.handler(new BootNettyUdpSimpleChannelInboundHandler());
            //6、绑定server，通过调用sync（）方法异步阻塞，直到绑定成功
            ChannelFuture f = serverBootstrap.bind(port).sync();
            log.info(BootNettyUdpServer.class.getName() + " started and listend on " + f.channel().localAddress());
            //7、监听通道关闭事件，应用程序会一直等待，直到channel关闭
            f.channel().closeFuture().sync();
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            System.out.println("netty udp close!");
            //8 关闭EventLoopGroup，
            bossLoopGroup.shutdownGracefully();
        }
    }
}