package com.quanroon.ysq.observer.com.quanroon.ysq.observer1;

/**
 * @author quanroong.ysq
 * @version 1.0.0
 * @description 广播者的超类，用于规范行为
 * @createtime 2020/8/7 20:46
 */
public interface Subject {

    //注册一个观察者(被通知者)，这里Observer也是所有类的超类
    void registerObserver(Observer o);

    //移除一个观察者(被通知者)，
    void removeObserver(Observer o);

    //通知所有观察者(被通知者)，
    void notifyObservers();
}
