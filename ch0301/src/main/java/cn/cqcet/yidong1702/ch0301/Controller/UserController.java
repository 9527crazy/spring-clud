package cn.cqcet.yidong1702.ch0301.Controller;

import cn.cqcet.yidong1702.ch0301.model.User;
import cn.cqcet.yidong1702.ch0301.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * FileName: UserController
 * Author:   刘帅
 * Date:     2019-9-18 16:52
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private Userservice userservice;
    @RequestMapping("/userList")
    public List<User> getAllUsers(){
        return userservice.getAllUsers();
    }
    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        userservice.deleteUser(id);
    }
}
