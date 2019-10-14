package com.ruanxy.apsDemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruanxy.apsDemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author rxy
 * @date 2019/10/12
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
    /**
     * 查询user列表方法
     * @return
     */
    List<User> findList();
}
