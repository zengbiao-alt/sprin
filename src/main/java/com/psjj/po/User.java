package com.psjj.po;

import lombok.*;

@Data//setter getter方法
@ToString//to String
@AllArgsConstructor//无参数构造方法
@NoArgsConstructor//全参数构造方法
@EqualsAndHashCode//equals 方法和hashCode方法
public class User {
    private  Integer id;
    private String name;
}
