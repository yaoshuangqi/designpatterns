package com.quanroon.ysq.builder.method2;

import com.quanroon.ysq.builder.method2.mobike.AlloyFrame;
import com.quanroon.ysq.builder.method2.mobike.DermisSeat;
import com.quanroon.ysq.builder.method2.mobike.SolidTire;

/**
 * @author quanroong.ysq
 * @version 1.0.0
 * @description
 * @createtime 2020/6/27 22:02
 */
public class MobikeBuilder extends Builder {

    private Bike mBike = new Bike();
    @Override
    void buildFrame() {
        mBike.setFrame(new AlloyFrame());
    }
    @Override
    void buildSeat() {
        mBike.setSeat(new DermisSeat());
    }
    @Override
    void buildTire() {
        mBike.setTire(new SolidTire());
    }
    @Override
    Bike createBike() {
        return mBike;
    }
}
