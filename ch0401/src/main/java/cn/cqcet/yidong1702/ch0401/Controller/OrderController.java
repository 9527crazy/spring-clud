package cn.cqcet.yidong1702.ch0401.Controller;
import cn.cqcet.yidong1702.ch0401.model.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: OrderController
 * Author:   刘帅
 * Date:     2019-9-19 11:15
 */
@RestController
public class OrderController {

    @GetMapping("order/{id}")
    public Order findOrderById(@PathVariable String id){
        Order order=new Order();
        order.setId("123");
        order.setPrice(23.5);
        order.setReceiverAddress("beijing");
        order.setReceiverName("xiaoqiang");
        order.setReceiverPhone("13422343311");
        return order;
    }

}
