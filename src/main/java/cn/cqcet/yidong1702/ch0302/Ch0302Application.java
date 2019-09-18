package cn.cqcet.yidong1702.ch0302;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ch0302Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch0302Application.class, args);
    }

}
