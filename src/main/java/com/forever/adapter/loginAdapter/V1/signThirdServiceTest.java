package com.forever.adapter.loginAdapter.V1;

import com.forever.adapter.loginAdapter.ResultMsg;
import com.forever.adapter.loginAdapter.V1.service.SignThirdService;

public class signThirdServiceTest {
    public static void main(String[] args) {
        SignThirdService service = new SignThirdService();
        ResultMsg msg = service.loginForQQ("abc");
        System.out.println(msg.getCode());
    }
}
