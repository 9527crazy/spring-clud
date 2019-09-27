package cn.cqcet.yidong1702.ch0301.Until;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * FileName: Ribon
 * Author:   刘帅
 * Date:     2019-9-19 11:59
 */
@Configuration
@ComponentScan
public class Ribon {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
