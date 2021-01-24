package com.atguigu.springcloud.entities;

import lombok.*;

/**
 * @Author: liuXiang
 * @Date: 2021/1/5 13:19
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
