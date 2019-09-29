package cn.cqcet.yidong1702.ch0503;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Ch0503Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch0503Application.class, args);
    }

}
