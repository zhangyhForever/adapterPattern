package com.forever.adapter.loginAdapter.V2.adapters;

import com.forever.adapter.loginAdapter.ResultMsg;

public class LoginForPhoneAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForPhoneAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
