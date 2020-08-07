package com.quanroon.ysq.builder.method2;

/**
 * @author quanroong.ysq
 * @version 1.0.0
 * @description 销售者，把车子推出去卖
 * @createtime 2020/6/27 22:10
 */
public class Director {

    private Builder mBuilder = null;
    public Director(Builder builder) {
        mBuilder = builder;
    }
    public Bike construct() {
        mBuilder.buildFrame();
        mBuilder.buildSeat();
        mBuilder.buildTire();
        return mBuilder.createBike();
    }
}
