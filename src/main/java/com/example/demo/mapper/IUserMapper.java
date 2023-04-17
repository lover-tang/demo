package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description: java类作用描述
 * @author tangzhihua
 * @since 2023/4/17 20:23 星期一
 */
@Mapper
public interface IUserMapper extends BaseMapper<User> {
}