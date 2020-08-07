package com.quanroon.ysq.observer.com.quanroon.ysq.observer2;



import java.util.Observable;
import java.util.Observer;

/**
 * @author quanroong.ysq
 * @version 1.0.0
 * @description
 * @createtime 2020/8/7 21:41
 */
public class CurrentConditionsDisplay implements Observer {

    Observable observable;//定义一个Observable
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);//注册该观察者
    }


    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {//如果obs是WeatherData类的一个实例
            WeatherData weatherData = (WeatherData)obs;
            //获取观察者需要的数据
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();//通知显示，这个通知可以抽象出来。已方便使用不同业务的通知
        }
    }

    //显示方法
    public void display() {
        System.out.println("温度："+temperature+"\n湿度:"+humidity);
    }


    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);

    }
}
