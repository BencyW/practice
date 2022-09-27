package com.whx.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author whx
 * @Date 2022/9/21 2:18 下午
 * @Version 1.0
 */
@Data
public class Emp implements Serializable {
    private Integer id;
    private String name;
}
