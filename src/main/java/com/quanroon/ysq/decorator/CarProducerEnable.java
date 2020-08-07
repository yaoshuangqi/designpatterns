package com.quanroon.ysq.decorator;

/**
 * @author quanroong.ysq
 * @version 1.0.0
 * @description 申明一个类，该类可以被继承，我们就可以对这个类进行扩展，即装饰
 * @createtime 2020/8/2 10:09
 */
public class CarProducerEnable implements ApiInterface {

    protected volatile ApiInterface apiInterface;

    public CarProducerEnable(ApiInterface apiInterface){
        this.apiInterface = apiInterface;
    }

    public void ApiCar() {
        System.out.println("api调用ApiInterface , 此时这个类被打成jar包，现在这类不适用了，我需要对其进行扩展，请看excludeInterface");
    }
}
