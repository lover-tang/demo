package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.IMoneyMapper;
import com.example.demo.pojo.Money;
import com.example.demo.service.IMoneyService;
import org.springframework.stereotype.Service;

/**
 * @Description: java类作用描述
 * @author tangzhihua
 * @since 2023/4/17 20:53 星期一
 */
@Service
public class MoneyServiceImpl extends ServiceImpl<IMoneyMapper, Money> implements IMoneyService {
}