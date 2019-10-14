package com.ruanxy.apsdemo.dao;

import com.ruanxy.apsdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author rxy
 * @date 2019/10/12
 */
@Mapper
public interface UserDao {
    /**
     * 查询user列表方法
     * @return
     */
    List<User> findList();
}
