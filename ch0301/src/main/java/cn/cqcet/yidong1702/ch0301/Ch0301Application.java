package cn.cqcet.yidong1702.ch0301;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCaching
public class Ch0301Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch0301Application.class, args);
    }

}
