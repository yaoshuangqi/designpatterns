package com.quanroon.ysq.observer.com.quanroon.ysq.observer1;

import java.util.ArrayList;

/**
 * @author quanroong.ysq
 * @version 1.0.0
 * @description 天气类
 * @createtime 2020/8/7 21:08
 */
public class WeatherData implements Subject {


    //定义一个ArrayList对象，用于存储注册的观察者类
    private ArrayList observers;
    private float temperature;//温度
    private float humidity;//湿度
    private float pressure;//气压

    public WeatherData(){
        observers = new ArrayList();
    }


    /**
     * 注册观察者
     * @param o
     */
    public void registerObserver(Observer o) {
        if(!observers.contains(o)){
            observers.add(o);
        }
    }

    /**
     * 移除观察者
     * @param o
     */
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(i);
        }
    }

    /**
     * 通知观察者
     */
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            //Observer是所以观察者的父类，此处运用了多态
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);//通知更新
        }
    }

    /**
     * 提供观察者手动去触发
     */
    public void measurementsChanged() {
        //触发通知
        notifyObservers();
    }

    /**
     * 提供当参数数据发生变化时，进行自动触发
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        //数据改变触发通知
        measurementsChanged();
    }
}
