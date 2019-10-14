package com.ruanxy.apsDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 启动测试controller
 * @author ruanxy
 * @date 2019/11/12
 */
@RestController
public class StartController {
    @RequestMapping(value = "startTest")
    public String startTest() {
        return "this is a start test!";
    }
}
