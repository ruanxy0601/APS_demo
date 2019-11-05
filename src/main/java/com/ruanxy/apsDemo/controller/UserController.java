package com.ruanxy.apsDemo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ruanxy.apsDemo.dao.UserDao;
import com.ruanxy.apsDemo.entity.User;
import com.ruanxy.apsDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * user控制层
 * @author rxy
 * @date 2019/10/12
 */
@RestController
public class UserController {

//    @Autowired
//    private UserService userService;
//    @Autowired
//    private UserDao userDao;
//
//    @RequestMapping("/getUsers")
//    public List<String> findList() {
//        QueryWrapper queryWrapper = new QueryWrapper();
//        List<User> userList = userDao.selectList(null);
////        List<User> userList = userDao.findList();
//        List<String> userStringList = new ArrayList<>();
//        for (User user : userList) {
//            userStringList.add(user.toString());
//        }
//        return userStringList;
//    }

}
