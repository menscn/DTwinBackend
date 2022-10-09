package com.msc.DTwinBackend;

import com.msc.DTwinBackend.udp.BootNettyUdpServer;
import com.msc.DTwinBackend.utils.ApplicationContextProvider;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class DTwinBackendApplication implements CommandLineRunner {

    private static ApplicationContextProvider applicationContextProvider = new ApplicationContextProvider();

    public static void main(String[] args) {
        ApplicationContext app = SpringApplication.run(DTwinBackendApplication.class, args);
        // 设置上下文
        applicationContextProvider.setApplicationContext(app);
    }

    @Async
    @Override
    public void run(String... args) {
        new BootNettyUdpServer().bind(8011);
    }
}
