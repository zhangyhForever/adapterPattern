package com.forever.adapter.loginAdapter.V2.adapters;

import com.forever.adapter.loginAdapter.ResultMsg;

public class LoginForWeChatAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWeChatAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
