package cn.cqcet.yidong1702.ch0503client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: Hello
 * Author:   刘帅
 * Date:     2019-9-29 11:52
 */
@RestController
public class Hello {

    @Value("${clientParam}")
    private String clientParam;
    @RequestMapping("/clientParam")
    public String getParam(){
        return clientParam;
    }
    @RequestMapping("/hello")
    public String hello(){
        return "Hello word";
    }
}
