package com.quanroon.ysq.builder.method2;

/**
 * @author quanroong.ysq
 * @version 1.0.0
 * @description 抽象建造者，专门去生产各个零件，并完成车子的制造
 * @createtime 2020/6/27 22:00
 */
public abstract class Builder {

    /**
     * 生产各个零件
     */
    abstract void buildFrame();
    abstract void buildSeat();
    abstract void buildTire();

    /**
     * 最后给出一个完整的车子
     * @return
     */
    abstract Bike createBike();
}
