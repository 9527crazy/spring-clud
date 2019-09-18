package cn.cqcet.yidong1702.ch0301.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

/**
 * FileName: QueueController
 * Author:   刘帅
 * Date:     2019-9-18 17:38
 */
@RestController
public class QueueController {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    private Queue queue;

    @RequestMapping("/send")
    public void send(){
        jmsMessagingTemplate.convertAndSend(queue,"新消息！！");
    }
}
