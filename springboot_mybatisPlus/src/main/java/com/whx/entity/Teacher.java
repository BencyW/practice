package com.whx.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * @Author whx
 * @Date 2022/9/23 1:44 下午
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("teacher")
public class Teacher implements Serializable {
//    @TableId(type = IdType.AUTO)//雪花算法
    private Integer tid;
//    @TableField
    private String tname;
    private String tel;
}
