package com.forever.adapter.powerAdapter;

public class PowerAdapter implements PowerDC5 {

    private PowerAC220V ac;

    public PowerAdapter(PowerAC220V ac){
        this.ac = ac;
    }
    public int dcOutput() {
        int acOutput = ac.acOutput();
        int dcOutput = acOutput/22;
        System.out.println("输出直流电压"+dcOutput+"V");
        return dcOutput;
    }
}
