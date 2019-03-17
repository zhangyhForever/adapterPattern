package com.forever.adapter.loginAdapter.V2.adapters;

import com.forever.adapter.loginAdapter.ResultMsg;

public class RegisterForQQAdapter implements RegisterAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof RegisterAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
