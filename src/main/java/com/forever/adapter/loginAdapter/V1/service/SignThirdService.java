package com.forever.adapter.loginAdapter.V1.service;

import com.forever.adapter.loginAdapter.ResultMsg;

public class SignThirdService extends SignService {

    public ResultMsg loginForQQ(String openId){
        //openId全局唯一，可认为是一个加长的用户名
        //密码默认为QQ的密码，此时为空
        //注册（在原有系统创建新的用户）
        //调用原来的登陆方法
        return loginForRegister(openId, null);
    }

    public ResultMsg loginForWechat(String openId){
        return loginForRegister(openId,null);
    }

    public ResultMsg loginForPhone(String phoneNumber, String code){
        return  loginForRegister(phoneNumber, code);
    }

    private ResultMsg loginForRegister(String openId, String password) {
        super.register(openId, null);
        return super.login(openId,null);
    }
}
