package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.pojo.Money;
import com.example.demo.service.IMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: java类作用描述
 * @author tangzhihua
 * @since 2023/4/17 20:51 星期一
 */
@RestController
@RequestMapping("/money")
public class MoneyController {

    @Autowired
    private IMoneyService moneyService;

    @PostMapping
    public List<Money> getList(String userId){
        QueryWrapper<Money> queryList = new QueryWrapper<>();
        queryList.eq("userid", userId);
        List<Money> monies = moneyService.list(queryList);

        return monies;
    }

}