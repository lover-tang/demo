package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.IUserMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @Description: java类作用描述
 * @author tangzhihua
 * @since 2023/4/17 20:21 星期一
 */
@Service
public class UserServiceImpl extends ServiceImpl<IUserMapper, User> implements IUserService {
}