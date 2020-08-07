package com.quanroon.ysq.observer.com.quanroon.ysq.observer1;

/**
 * @author quanroong.ysq
 * @version 1.0.0
 * @description 定义一个客户端显示当前数据
 * @createtime 2020/8/7 21:21
 */
public class CurrentConditionsDisplay implements Observer {


    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;//保存 weatherData对象，方便后续移除该观察者
        this.weatherData.registerObserver(this);//注册观察者
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        dispalyData("温度："+temp, "湿度："+humidity, "气压："+pressure);//调用显示方法显示数据
    }

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 90, 100l);
        weatherData.setMeasurements(90, 90, 100l);
    }

}
