package com.xuyuan.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author: xuyuan
 * @Email: xuyuanweb@sjtu.edu.cn
 * @Create: 2022/5/6 1:21
 * @Description:
 */

@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler(ArithmeticException.class)
    public Result doException(Exception ep) {
        return new Result().setCode(ResCode.Exception_code).setMsg("出现算数异常，请检查后重试！");
    }
}
