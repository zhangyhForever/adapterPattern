package com.forever.adapter.loginAdapter.V2.adapters;

import com.forever.adapter.loginAdapter.ResultMsg;

public interface RegisterAdapter {

    boolean support(Object adapter);

    ResultMsg login(String id, Object adapter);
}
