package com.forever.adapter.powerAdapter;

public class PowerAdapterTest {
    public static void main(String[] args) {
        PowerAdapter pa = new PowerAdapter(new PowerAC220V());
        pa.dcOutput();
    }
}
