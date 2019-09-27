package cn.cqcet.yidong1702.ch0401;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ch0401Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch0401Application.class, args);
    }

}
