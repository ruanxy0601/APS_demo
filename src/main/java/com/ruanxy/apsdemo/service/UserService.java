package com.ruanxy.apsdemo.service;

import com.ruanxy.apsdemo.dao.UserDao;
import com.ruanxy.apsdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * user事务层
 * @author rxy
 * @date 2019/10/12
 */
@Service
public class UserService {

    @Autowired
    private UserDao dao;

    public List<User> findlist() {
        return dao.findList();
    }
}
