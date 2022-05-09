package com.xuyuan.controller;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author: xuyuan
 * @Email: xuyuanweb@sjtu.edu.cn
 * @Create: 2022/5/6 1:00
 * @Description:
 */

@Data
@Accessors(chain = true)
public class Result {
    private int code;
    private Object data;
    private String msg;
}
