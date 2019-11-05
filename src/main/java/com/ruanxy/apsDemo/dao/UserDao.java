package com.ruanxy.apsDemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruanxy.apsDemo.entity.User;

import java.util.List;

/**
 * @author rxy
 * @date 2019/10/12
 */
public interface UserDao extends BaseMapper<User> {
    /**
     * 查询user列表方法
     * @return
     */
    List<User> findList();
}
