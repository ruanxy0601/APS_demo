package com.ruanxy.apsDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApsdemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    //==========================redis的test方法
    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    @Test
    public void redisTest(){
        redisTemplate.opsForValue().set("name","ruanxy");
        System.out.println(redisTemplate.opsForValue().get("name"));
    }

    //===========================
}
