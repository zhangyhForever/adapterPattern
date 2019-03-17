package com.forever.adapter.loginAdapter.V2.adapters;

import com.forever.adapter.loginAdapter.ResultMsg;

public class LoginForQQAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
