package com.quanroon.ysq.decorator;

/**
 * @author quanroong.ysq
 * @version 1.0.0
 * @description 申明一个类，该类不能被继承，我们就对接口进行扩展
 * @createtime 2020/8/2 10:09
 */
public final class CarProducer implements ApiInterface {
    public void ApiCar() {
        System.out.println("api调用ApiInterface , 此时这个类被打成jar包，现在这类不适用了，我需要对其进行扩展，请看excludeInterface");
    }
}
