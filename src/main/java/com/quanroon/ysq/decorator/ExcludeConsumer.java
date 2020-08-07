package com.quanroon.ysq.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author quanroong.ysq
 * @version 1.0.0
 * @description 声明实际装饰者的类，该类持有原有类的引用
 * @createtime 2020/8/2 10:13
 */
public class ExcludeConsumer implements  ExcludeInterface {

    //定义内部成员变量，即持有原有不可继承的类的引用
    private ApiInterface carProducer;

    public ExcludeConsumer(ApiInterface carProducer){
        this.carProducer =carProducer;
    }


    public void CarStyle() {
        System.out.println("车的样式，这就是装饰类的目的");
    }

    //被调者是持有相同的调用方法，只是功能进行了增强
    public void ApiCar() {
        carProducer.ApiCar();
        CarStyle();
    }

    public static void main(String[] args) throws FileNotFoundException {
        //使用自己的类，并扩展原有接口的功能，且实用了原有类的功能，并没有破坏原有类的功能
        ExcludeConsumer excludeConsumer = new ExcludeConsumer(new CarProducer());
        excludeConsumer.ApiCar();

        new BufferedInputStream(new FileInputStream(""));
    }
}
