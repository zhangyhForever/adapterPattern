package com.forever.adapter.loginAdapter.V2.adapters;

import com.forever.adapter.loginAdapter.ResultMsg;

public interface LoginAdapter {

    boolean support(Object adapter);

    ResultMsg login(String id, Object adapter);
}
