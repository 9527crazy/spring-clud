package cn.cqcet.yindong1702.ch0502;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class Ch0502Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch0502Application.class, args);
    }

}
