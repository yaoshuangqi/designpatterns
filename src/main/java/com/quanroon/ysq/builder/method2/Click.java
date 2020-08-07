package com.quanroon.ysq.builder.method2;

/**
 * @author quanroong.ysq
 * @version 1.0.0
 * @description 客户，去买车
 * @createtime 2020/6/27 22:13
 */
public class Click {

    public static void main(String[] args) {
        showBike(new OfoBuilder());
        showBike(new MobikeBuilder());
    }
    private static void showBike(Builder builder) {
        Director director = new Director(builder);
        Bike bike = director.construct();
        bike.getFrame().frame();
        bike.getSeat().seat();
        bike.getTire().tire();
    }
}
