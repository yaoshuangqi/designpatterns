package com.quanroon.ysq.observer.com.quanroon.ysq.observer2;

import java.util.Observable;

/**
 * @author quanroong.ysq
 * @version 1.0.0
 * @description
 * @createtime 2020/8/7 21:40
 */
public class WeatherData extends abstractTest {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() { }

    /**
     * 这两步就是来完成广播前的工作
     */
    public void measurementsChanged() {
        setChanged();//激活改变状态，使changed值为true
        notifyObservers();//调用通知
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    //方便观察者取数据
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
