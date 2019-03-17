package com.forever.adapter.loginAdapter.V2.service;

import com.forever.adapter.loginAdapter.ResultMsg;

public class SignService {

    public ResultMsg register(String username, String password){
        return new ResultMsg(200,"注册成功");
    }

    public ResultMsg login(String username, String password){
        return new ResultMsg(200,"登陆成功");
    }
}
