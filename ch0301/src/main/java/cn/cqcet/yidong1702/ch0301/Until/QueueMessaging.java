package cn.cqcet.yidong1702.ch0301.Until;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

/**
 * FileName: QueueMessaging
 * Author:   刘帅
 * Date:     2019-9-18 17:45
 */
@Component
public class QueueMessaging {
    @Bean
    public Queue queue(){
        return new ActiveMQQueue("active.queue");
    }
}
