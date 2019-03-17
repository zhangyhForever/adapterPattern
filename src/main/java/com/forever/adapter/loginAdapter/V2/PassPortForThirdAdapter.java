package com.forever.adapter.loginAdapter.V2;

import com.forever.adapter.loginAdapter.ResultMsg;
import com.forever.adapter.loginAdapter.V1.service.SignThirdService;
import com.forever.adapter.loginAdapter.V2.adapters.LoginAdapter;
import com.forever.adapter.loginAdapter.V2.adapters.LoginForPhoneAdapter;
import com.forever.adapter.loginAdapter.V2.adapters.LoginForWeChatAdapter;

public class PassPortForThirdAdapter extends SignThirdService implements PassPortForThird {

    public ResultMsg loginForQQ(String openId) {
//        return processAdapter(openId, LoginForQQAdapter.class);
        return processAdapter(openId, LoginForWeChatAdapter.class);
    }

    public ResultMsg loginForWeChat(String openId) {
        return processAdapter(openId, LoginForWeChatAdapter.class);
    }

    public ResultMsg loginForPhone(String phoneNumber, String code) {
        return processAdapter(phoneNumber, LoginForPhoneAdapter.class);
    }

    public ResultMsg registerForLogin(String username, String password) {
        super.register(username, password);
        return super.login(username, password);
    }


    private ResultMsg processAdapter(String key, Class<? extends LoginAdapter> clazz){
        try{
            LoginAdapter adapter = clazz.newInstance();
            if(adapter.support(adapter)){
                adapter.login(key, adapter);
                return new ResultMsg(200,"createAdapterSuccess");
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return new ResultMsg(400,"adapter is not fit!");
    }
}
