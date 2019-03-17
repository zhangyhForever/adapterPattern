package com.forever.adapter.loginAdapter.V2;

import com.forever.adapter.loginAdapter.ResultMsg;

/**
 * 只进行扩展
 */
public interface PassPortForThird {

    ResultMsg loginForQQ(String openId);

    ResultMsg loginForWechat(String openId);

    ResultMsg loginForPhone(String phoneNumber, String code);

    ResultMsg registerForLogin(String username, String password);
}
