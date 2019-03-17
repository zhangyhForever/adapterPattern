package com.forever.adapter.powerAdapter;

public class PowerAC220V {

    public int acOutput(){
        int out = 220;
        System.out.println("交流电供压"+out+"V");
        return out;
    }
}
