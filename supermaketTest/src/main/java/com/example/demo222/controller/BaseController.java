package com.example.demo222.controller;


import com.example.demo222.util.AjaxResult;

/**
 * web层通用数据处理
 * 
 */
public class BaseController {

    /**
     * 返回成功
     */
    public AjaxResult success() {
        return AjaxResult.success();
    }

    /**
     * 返回失败消息
     */
    public AjaxResult error() {
        return AjaxResult.error();
    }

}

