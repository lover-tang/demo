package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: java类作用描述
 * @author tangzhihua
 * @since 2023/4/17 20:01 星期一
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 查询当前用户余额
     * @param userId
     * @return
     */
    @PostMapping
    public Integer getMoney(String userId){
        User user = userService.getById(userId);
        return user.getMoney();
    }

    /**
     * 该用户消费100
     * @param userId
     * @return
     */
    @PutMapping("/xiaofei100")
    public User editOne(String userId){
        User user = userService.getById(userId);
        if(user.getMoney() >= 100){
            user.setMoney(user.getMoney() - 100);
            userService.updateById(user);

            //将用户钱包金额变动的明细存放进Money表
        } else {
            System.out.println("该用户余额不足，无法消费!");
        }
        return user;
    }

    /**
     * 该用户退款20
     * @param userId
     * @return
     */
    @PutMapping("/tuikuan20")
    public User editTwo(String userId){
        User user = userService.getById(userId);
        user.setMoney(user.getMoney() + 20);
        userService.updateById(user);

        //将用户钱包金额变动的明细存放进Money表
        return user;
    }
}