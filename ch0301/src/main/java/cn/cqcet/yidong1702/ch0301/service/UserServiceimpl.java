package cn.cqcet.yidong1702.ch0301.service;

import cn.cqcet.yidong1702.ch0301.Repository.UserRepository;
import cn.cqcet.yidong1702.ch0301.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * FileName: UserServiceimpl
 * Author:   刘帅
 * Date:     2019-9-18 16:42
 */
@Service
public class UserServiceimpl implements Userservice {

    @Autowired
    private UserRepository userRepository;

    @Cacheable(value = "UserCache",key = "'user.getAllUsers'")
    @Override
    public List<User> getAllUsers() {
        List<User> list=(List<User>) userRepository.findAll();
        return list;
    }

    @CacheEvict(value = "UserCache",key = "'user.getAllUsers'")
    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
