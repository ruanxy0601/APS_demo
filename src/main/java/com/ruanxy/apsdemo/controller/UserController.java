package com.ruanxy.apsdemo.controller;

import com.ruanxy.apsdemo.entity.User;
import com.ruanxy.apsdemo.service.UserService;
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

    @Autowired
    private UserService userService;

    @RequestMapping("/getUsers")
    public List<String> findList() {
        List<User> userList = userService.findlist();
        List<String> userStringList = new ArrayList<>();
        for (User user : userList) {
            userStringList.add(user.toString());
        }
        return userStringList;
    }

}
