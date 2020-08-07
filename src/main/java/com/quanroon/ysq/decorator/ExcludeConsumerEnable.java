package com.quanroon.ysq.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author quanroong.ysq
 * @version 1.0.0
 * @description
 * @createtime 2020/8/2 10:13
 */
public class ExcludeConsumerEnable extends  CarProducerEnable {

    public ExcludeConsumerEnable(ApiInterface carProducer){
       super(carProducer);
    }

    public void CarStyle() {
        System.out.println("车的样式，这就是装饰类的目的");
    }

    //被调者是持有相同的调用方法，只是功能进行了增强
    public void ApiCar() {
        apiInterface.ApiCar();
        CarStyle();
    }

    public static void main(String[] args) throws FileNotFoundException {
        //使用自己的类，并扩展原有接口的功能，且实用了原有类的功能，并没有破坏原有类的功能
        ExcludeConsumerEnable excludeConsumer = new ExcludeConsumerEnable(new CarProducer());
        excludeConsumer.ApiCar();

        //new BufferedInputStream(new FileInputStream(""));
    }
}
