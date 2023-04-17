package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @Description: java类作用描述
 * @author tangzhihua
 * @since 2023/4/17 20:10 星期一
 */
@Data
public class User {
    @TableId("userid")
    private String userId;

    @TableField("money")
    private Integer money;
}