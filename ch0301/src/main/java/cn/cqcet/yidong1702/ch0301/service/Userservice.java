package cn.cqcet.yidong1702.ch0301.service;

import cn.cqcet.yidong1702.ch0301.model.User;

import java.util.List;

/**
 * FileName: Userservice
 * Author:   刘帅
 * Date:     2019-9-18 16:41
 */
public interface Userservice {
    List<User> getAllUsers();
    void deleteUser(Integer id);
}
