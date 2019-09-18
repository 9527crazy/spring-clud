package cn.cqcet.yidong1702.ch0301.Controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: CustomerController
 * Author:   刘帅
 * Date:     2019-9-18 17:42
 */
@RestController
public class CustomerController {
    @JmsListener(destination = "active.queue")
    public void readActiveQueue(String message){
        System.out.println("接受到："+message);
    }
}
