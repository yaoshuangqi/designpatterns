package com.quanroon.ysq.builder.method2;

import com.quanroon.ysq.builder.method2.component.IFrame;
import com.quanroon.ysq.builder.method2.component.ISeat;
import com.quanroon.ysq.builder.method2.component.ITire;

/**
 * @author quanroong.ysq
 * @version 1.0.0
 * @description 这是一个产品类
 * @createtime 2020/6/27 21:52
 */
public class Bike {
    //各种零件如：框架、座位、轮胎等

    private IFrame frame;
    private ISeat seat;
    private ITire tire;

    public IFrame getFrame() {
        return frame;
    }

    public void setFrame(IFrame frame) {
        this.frame = frame;
    }

    public ISeat getSeat() {
        return seat;
    }

    public void setSeat(ISeat seat) {
        this.seat = seat;
    }

    public ITire getTire() {
        return tire;
    }

    public void setTire(ITire tire) {
        this.tire = tire;
    }
}
