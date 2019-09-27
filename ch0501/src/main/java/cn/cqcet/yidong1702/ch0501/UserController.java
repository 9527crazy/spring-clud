package cn.cqcet.yidong1702.ch0501;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * FileName: UserController
 * Author:   刘帅
 * Date:     2019-9-27 12:41
 */
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("findOrdersByUser/{id}")
    @Hystrix(fallbackHandler = )
    @Hy
    public String findOrdersByUser(@PathVariable String id){
        return restTemplate.getForObject("http://microservice-euereka-order/order/" + id, String.class);
    }

    public String fallbackInfo(@PathVariable String id){
        return "服务不可用 ， 请稍后再试！！";
    }
}
