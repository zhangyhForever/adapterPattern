package com.forever.adapter.loginAdapter.V2;

import com.forever.adapter.loginAdapter.ResultMsg;
import com.forever.adapter.loginAdapter.V2.adapters.LoginAdapter;
import com.forever.adapter.loginAdapter.V2.adapters.LoginForQQAdapter;
import com.forever.adapter.loginAdapter.V2.adapters.RegisterAdapter;
import com.forever.adapter.loginAdapter.V2.adapters.RegisterForQQAdapter;
import org.springframework.web.servlet.DispatcherServlet;

public class PassPortForThirdAdapterTest {
    public static void main(String[] args) {
        PassPortForThirdAdapter thirdAdapter = new PassPortForThirdAdapter();
        ResultMsg msg = thirdAdapter.loginForQQ("aaaaa");
        System.out.println(msg.getCode()+"===="+msg.getMessage());

        RegisterAdapter ra = new RegisterForQQAdapter();
        LoginAdapter la = new LoginForQQAdapter();
        System.out.println(la.support(ra));
    }
}
