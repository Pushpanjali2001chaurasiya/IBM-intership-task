package com.test;

import com.electronics.SmartPhone;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("BrandX", "ModelY");
        
        smartPhone.powerOn();
        smartPhone.connectToWiFi();
        smartPhone.makeCall();
    }
}
