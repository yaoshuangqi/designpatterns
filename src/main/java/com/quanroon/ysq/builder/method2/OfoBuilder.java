package com.quanroon.ysq.builder.method2;

import com.quanroon.ysq.builder.method2.ofo.CarbonFrame;
import com.quanroon.ysq.builder.method2.ofo.InflateTire;
import com.quanroon.ysq.builder.method2.ofo.RubberSeat;

/**
 * @author quanroong.ysq
 * @version 1.0.0
 * @description
 * @createtime 2020/6/27 22:02
 */
public class OfoBuilder extends Builder{

    private Bike mBike = new Bike();
    @Override
    void buildFrame() {
        mBike.setFrame(new CarbonFrame());
    }
    @Override
    void buildSeat() {
        mBike.setSeat(new RubberSeat());
    }
    @Override
    void buildTire() {
        mBike.setTire(new InflateTire());
    }
    @Override
    Bike createBike() {
        return mBike;
    }
}
